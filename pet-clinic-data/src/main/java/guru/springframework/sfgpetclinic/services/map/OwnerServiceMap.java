package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

// delete all the methods and generate implementation and you will find the generic T type used (with AbstractMapService coded)
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{
    @Override
    public Set<Owner> findAll() {
        return null;
    }

    @Override
    public Owner findById(Long aLong) {
        return null;
    }

    @Override
    public Owner save(Owner object) {
        return null;
    }

    @Override
    public void delete(Owner object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
