package net.raisetech.restapi;

import net.raisetech.restapi.DELETE.NameDeleteRequest;
import net.raisetech.restapi.DELETE.NameDeleteResponse;
import net.raisetech.restapi.GET.NameResponse;
import net.raisetech.restapi.PATCH.NameUpdateRequest;
import net.raisetech.restapi.PATCH.NameUpdateResponse;
import net.raisetech.restapi.POST.NameCreateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@Validated
public class NameController {

    @GetMapping("/names")
    public List<NameResponse> getNames(@RequestParam("sample") String sample) {
        List<NameResponse> names = List.of(
                new NameResponse("yuu", "satake", "takashi", 1),
                new NameResponse("aki", "hosokawa", "takashi", 2),
                new NameResponse("moyo", "iori", "takashi", 3));


        return names;

    }

    @PostMapping("/names")
    public ResponseEntity<String> create(@RequestBody @Validated NameCreateRequest form) {
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/users/id")
                .build()
                .toUri();

        return ResponseEntity.created(url).body("name successfully created");
    }

    @PatchMapping("/names/{id}")
    public NameUpdateResponse updateName(@PathVariable("id") String id, @RequestBody NameUpdateRequest
            nameUpdateRequest) {
        return new NameUpdateResponse("a name is updated");
    }

    @DeleteMapping("/names/{id}")
    public NameDeleteResponse deleteName(@PathVariable("id") String id, @RequestBody NameDeleteRequest
            nameDeleteRequest) {
        return new NameDeleteResponse("a name is deleted");
    }
}
