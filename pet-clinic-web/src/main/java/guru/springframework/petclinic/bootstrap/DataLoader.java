package guru.springframework.petclinic.bootstrap;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.model.Pet;
import guru.springframework.petclinic.model.PetType;
import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.services.OwnerService;
import guru.springframework.petclinic.services.PetTypeService;
import guru.springframework.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by at on on 17-Aug-19.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("dogg");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("catt");
        PetType savedCatType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Ali");
        owner1.setLastName("Tok");
        owner1.setAddress("Sarıyer");
        owner1.setCity("İstanbul");
        owner1.setTelephone("555-888-87-87");

        Pet mikesPet = new Pet();
        mikesPet.setName("Rooo");
        mikesPet.setPetType(savedCatType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Ahmet");
        owner2.setLastName("Say");
        owner1.setAddress("Seyhan");
        owner1.setCity("Adana");
        owner1.setTelephone("555-111-27-84");

        Pet fionasDog = new Pet();
        fionasDog.setName("Dogg");
        fionasDog.setBirthDate(LocalDate.now());
        fionasDog.setPetType(savedDogType);
        fionasDog.setOwner(owner2);
        owner2.getPets().add(fionasDog);

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("çiko");
        vet1.setLastName("Ayy");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Sam");
        vet2.setLastName("Axx");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
