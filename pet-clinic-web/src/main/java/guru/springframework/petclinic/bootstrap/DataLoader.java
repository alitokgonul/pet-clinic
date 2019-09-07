package guru.springframework.petclinic.bootstrap;

import guru.springframework.petclinic.model.*;
import guru.springframework.petclinic.services.*;
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
    private final SpecialityService specialityService;
    private final VisitService visitService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("dogg");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("catt");
        PetType savedCatType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);

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
        mikesPet.setOwner(owner1);
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

        Visit catVisit = new Visit();
        catVisit.setPet(mikesPet);
        catVisit.setDescription("visit desc");
        catVisit.setDate(LocalDate.now());

        visitService.save(catVisit);
        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("çiko");
        vet1.setLastName("Ayy");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Sam");
        vet2.setLastName("Axx");
        vet2.getSpecialities().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
