package com.RestAPI.Rest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UserEntity
 *
 * @author xuanl
 * @version 01-00
 * @since 7/22/2024
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "_user")
public class UserEntity {
    @Id
    @GeneratedValue
    private long id;
    private String name;
}
