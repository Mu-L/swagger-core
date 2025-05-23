package io.swagger.v3.core.oas.models;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Optional;

public class BeanValidationsModel {
    @NotNull
    protected Long id;

    @Min(13)
    @Max(99)
    protected Integer age;

    @Pattern(regexp = "(?![-._])[-._a-zA-Z0-9]{3,32}")
    protected String username;

    @Size(min = 6, max = 20)
    protected String password;

    protected String passwordHint;

    @Email
    protected String email;

    @DecimalMin(value = "0.1", inclusive = false)
    protected Double minBalance;

    @DecimalMax(value = "1000000", inclusive = false)
    protected Double maxBalance;

    protected Integer birthYear;

    @Size(min = 2, max = 10)
    private List<@Size(min = 3, max = 4) String> items;

    private Optional<@Size(min= 1, max=10) String> optionalValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(Double minBalance) {
        this.minBalance = minBalance;
    }

    public Double getMaxBalance() {
        return maxBalance;
    }

    public void setMaxBalance(Double maxBalance) {
        this.maxBalance = maxBalance;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public Optional<String> getOptionalValue() {
        return optionalValue;
    }

    public void setOptionalValue(Optional<String> optionalValue) {
        this.optionalValue = optionalValue;
    }

}
