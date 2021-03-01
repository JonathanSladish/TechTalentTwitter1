package com.tts.TechTalentTwitter.repository;


@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String role);
}