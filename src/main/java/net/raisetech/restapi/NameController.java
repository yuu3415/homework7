package net.raisetech.restapi;

import net.raisetech.restapi.DELETE.NameDeleteRequest;
import net.raisetech.restapi.DELETE.NameDeleteResponse;
import net.raisetech.restapi.GET.NameResponse;
import net.raisetech.restapi.PATCH.NameUpdateRequest;
import net.raisetech.restapi.PATCH.NameUpdateResponse;
import net.raisetech.restapi.POST.NameCreateRequest;
import net.raisetech.restapi.POST.NameCreateResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class NameController {

    @GetMapping("/names")
    public List<NameResponse> getNames(@RequestParam("sample") String sample) {
        List<NameResponse> names = List.of(
                new NameResponse("yuu", "satake"),
                new NameResponse("aki", "hosokawa"),
                new NameResponse("moe", "iori"));


        return names;

    }

    @PostMapping("/names")
    public ResponseEntity<NameCreateResponse> createName(@RequestBody NameCreateRequest nameCreateRequest, UriComponentsBuilder uriComponentsBuilder) {
        URI uri = uriComponentsBuilder.path("/names/{id}").buildAndExpand(1234).toUri();
        return ResponseEntity.created(uri).body(new NameCreateResponse("a new name is created"));
    }

    @PatchMapping("/names/{id}")
    public NameUpdateResponse updateName(@PathVariable("id") String id, @RequestBody NameUpdateRequest nameUpdateRequest) {
        return new NameUpdateResponse("a name is updated");
    }

    @DeleteMapping("/names/{id}")
    public NameDeleteResponse deleteName(@PathVariable("id") String id, @RequestBody NameDeleteRequest nameDeleteRequest) {
        return new NameDeleteResponse("a name is deleted");
    }
}
