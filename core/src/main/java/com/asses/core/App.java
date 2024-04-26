package com.asses.core;

import java.util.ArrayList;
import java.util.List;

import com.asses.core.dto.UserDto;
import com.asses.core.entity.AirHosterss;
import com.asses.core.entity.Brand;
import com.asses.core.entity.Flight;
import com.asses.core.entity.Product;
import com.asses.core.entity.Team;
import com.asses.core.entity.UserEntity;
import com.asses.core.entity.captain;
import com.asses.core.repository.AssosiationRepository;
import com.asses.core.repository.RepositoryManytoMany;
import com.asses.core.repository.UserHqlRepository;
import com.asses.core.repository.UserRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        UserEntity userEntity = new UserEntity();
//      // userEntity.setAltkey(126);
//        userEntity.setName("mukunda");
//        userEntity.setEmail("mukunda@gmail.com");
//        userEntity.setContactNumber("557744");
//        userEntity.setPassword("127");
//        userEntity.setCity("bangalore");
//        userEntity.setCountry("india");
//        userEntity.setPincode("3306");
//  /*
//   * Hibernate: insert into user_details (city, contact_number, country, email, name, password,
//   *  pin_code, alt_key)     *  values (?, ?, ?, ?, ?, ?, ?, ?)
//   */
//      UserRepository repository = new  UserRepository();
//      //repository.saveOrUpdate(userEntity);
//      //UserEntity entity = repository.findById(123);
//      //System.out.println(entity);
//       UserDto userDto1 = new UserDto();
//        userDto1.setAlt_key(124);
//        userDto1.setName("New Ramcharn");
//        userDto1.setCity("New bangalore");
//        userDto1.setCountry("India");
//        userDto1.setPincode("1055661");
//      // repository.update(userDto);
//        
        
//       //repository.delete(userDto1);
//        UserHqlRepository hqlRepository = new UserHqlRepository();
//   /*    List<UserEntity> userEntityList = hqlRepository.findAll();
//        userEntityList.forEach(each->{
//        	System.out.println(each);
//        });
//        /*
//         List<UserEntity> userEntitySortedList = userEntityList.stream().filter(each->each
//        		 .getName().equalsIgnoreCase("Ramcharan")) .collect(Collectors.toList());
//        */
//      /*  List<UserEntity> findbyName = hqlRepository.findByName("mukunda");
//       findbyName.forEach(each->{
//        	System.out.println(each);
//        });
//        */
//        //hqlRepository.updatePasswordByEmail("abc123", "radha@gmail.com");
//        hqlRepository.deleteUserByEmail("mukunda@gmail.com");
        
        
     /*   captain captain1 = new captain();
        captain1.setCaptain_name("MS Dhoni");
       captain1.setAge("35");
        captain1.setEmail("ms@gmail.com");
        
        Team team = new Team();
        team.setName("Indian Cricket");
        team.setTeam_size("11");
        team.setTeam_type("cricket");
        team.setEmail("cricket@email");
        team.setCaptain(captain1);
 /  assosiationRepository.savaFlightDetails(flight);
       
        
        
     /*   Product product1 = new Product();
        product1.setName("curd");
        
        Product product2 = new Product();
        product2.setName("milk");
        
        Product product3 = new Product();
        product3.setName("ghee");
        
        ArrayList<Product> pro = new ArrayList<Product>();
        pro.add(product1);
        pro.add(product2);
        pro.add(product3);
      
        
        Brand brand1 = new Brand();
        brand1.setBrand("amul");
        brand1.setProduct(pro);
        
        Brand brand2 = new Brand();
        brand2.setBrand("nandini");
        brand2.setProduct(pro);

        
        Brand brand3 = new Brand();
        brand3.setBrand("gayatri");
        brand3.setProduct(pro);

        
        
        ArrayList<Brand> brand = new ArrayList<Brand>();
        brand.add(brand1);
        brand.add(brand2);
        brand.add(brand3);
        
        
        product1.setBrands(brand);
        product2.setBrands(brand);
        product3.setBrands(brand);

        
        
        RepositoryManytoMany manytoMany = new RepositoryManytoMany();

        manytoMany.savaBrand(brand1);
        
        */
        
        
    }
}
