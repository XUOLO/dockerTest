package com.RestAPI.Rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UserRepo
 *
 * @author xuanl
 * @version 01-00
 * @since 7/22/2024
 */

public interface UserRepo extends JpaRepository<UserEntity, Integer> {

}
