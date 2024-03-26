package agriya.addressbook.addressbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContactController {
    ContactRepository repository;
@Autowired
    public ContactController(ContactRepository repository) {
        this.repository = repository;
    }

    @GetMapping ("/getall")
    public List<Contact> getAllContact() {
        return repository.findAll();
    }
    @GetMapping ("/getbyid/{id}")
    public Optional<Contact> getContactByID(@PathVariable Integer id) {

        return repository.findById(id);
    }

    @PostMapping ("/newcontact")
    public Contact savenewcontact (@RequestBody Contact contact){
    return repository.save(contact);
    }

    @DeleteMapping ("/deletecontact/{id}")
    public void deletecontact(@PathVariable Integer id) {

        repository.deleteById(id);

    }

    @PutMapping ("/updatecontact/")
    public Contact updatecontact(@RequestBody Contact contact){

   return repository.save(contact);

    }
     }
