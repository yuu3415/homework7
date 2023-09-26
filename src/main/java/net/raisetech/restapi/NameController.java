package net.raisetech.restapi;

import net.raisetech.restapi.DELETE.NameDeleteRequest;
import net.raisetech.restapi.DELETE.NameDeleteResponse;
import net.raisetech.restapi.GET.NameResponse;
import net.raisetech.restapi.PATCH.NameUpdateRequest;
import net.raisetech.restapi.PATCH.NameUpdateResponse;
import net.raisetech.restapi.POST.NameCreateResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class NameController {

    @GetMapping("/names")
    public List<NameResponse> getNames(@RequestParam("sample") String sample) {
        List<NameResponse> names = List.of(
                new NameResponse("yuu", "satake", "takashi", 1),
                new NameResponse("aki", "hosokawa", "takashi", 2),
                new NameResponse("moe", "iori", "takashi", 3));


        return names;

    }

    @PostMapping("/names")
    public ResponseEntity<Map<String, String>> NameCreateResponse(@PathVariable("id") int id, @RequestBody NameCreateResponse nameCreateResponse) {
        return ResponseEntity.ok(Map.of("message", "name successfully updated"));
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
