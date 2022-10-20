package com.example.bsale.adapter.in.controller;

import com.example.bsale.adapter.in.dto.ProductResponse;
import com.example.bsale.domain.port.in.SearchUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

@RestController
@RequestMapping("/products")
public class ProductController {

    private SearchUseCase searchUseCase;

    public ProductController(SearchUseCase searchUseCase) {
        this.searchUseCase = searchUseCase;
    }

    @GetMapping(value = "/category/{idCategory}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Flux<ProductResponse> all(@PathVariable int idCategory) {
        return searchUseCase.findProducts(idCategory)
                .map(ProductResponse::from);
    }

    @PostMapping(value = "/multipart",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE})
    public Map<String, Object> multiPart(@RequestPart("valHash") String valHash, @RequestPart("archivo") FilePart file) throws IOException {
        File document = File.createTempFile("trama", ".zip");
        StringJoiner binaryData = new StringJoiner(" ");

        file.transferTo(document).subscribe();

        try(InputStream inputData = new FileInputStream(document);
            ByteArrayOutputStream fileData = new ByteArrayOutputStream()) {

            inputData.transferTo(fileData);

            for(Byte data : fileData.toByteArray()) {
                binaryData.add(Integer.toBinaryString(data));
            }
        }
        catch (Exception ex) {
        }

        Map<String, Object> data = new HashMap<>();
        data.put("valHash", valHash);
        data.put("archivo-name", file.filename());
        data.put("archivo-lenght", file.headers().toSingleValueMap().toString());
        data.put("archivo-contest", document.length());
        data.put("archivo-data", binaryData.toString());
        return data;
    }
}
