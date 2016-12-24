package model;

import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.persistence.*;
import java.util.Set;

/**
 * Created by dominik on 2016-12-23.
 */


@Entity
@Table(name = "Konta")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;

    @Basic(optional = false)
    @Column(name = "nazwa_uzytkownika", length = 30)
    private String login;

    @Basic(optional = false)
    @Column(name = "haslo", length = 30)
    private String password;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (accountId != null ? !accountId.equals(account.accountId) : account.accountId != null) return false;
        if (login != null ? !login.equals(account.login) : account.login != null) return false;
        return password != null ? password.equals(account.password) : account.password == null;

    }

    @Override
    public int hashCode() {
        int result = accountId != null ? accountId.hashCode() : 0;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


