package com.lcvcode.loginauthapi.repositores;

import com.lcvcode.loginauthapi.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

//para o JPA basta ser interface o JPA em runtime gera classe
public interface UserRepository extends JpaRepository<User, String> {

}
