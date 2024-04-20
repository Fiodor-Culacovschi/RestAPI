package com.RestAPI.Rest;

import com.RestAPI.Rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepo extends JpaRepository<User,Long> {
}