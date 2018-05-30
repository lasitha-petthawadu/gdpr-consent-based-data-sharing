package gdpr.filter;

import org.springframework.stereotype.Component;

@Component
public class BusinessLogicService {

    @FilterPersonalData
    public UserEntity sharePersonalData(){
        // Ideally this User object should be fetched from the DB or any other data source.
        // Creating manually for simplicity.
        UserEntity userEntity = new UserEntity();
        userEntity.setName("Lasitha");
        userEntity.setEmail("test@test.com");
        userEntity.setAge(30);
        return userEntity;
    }
}
