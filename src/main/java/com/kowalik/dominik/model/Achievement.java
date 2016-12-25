package com.kowalik.dominik.model;

import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by dominik on 2016-12-24.
 */
@Entity
@Table(name  = "Osiagniecia")
@Component
public class Achievement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_osiagniecia")
    private Integer achievementId;

    @Column(name = "data", nullable = false)
    private LocalDate date;

    @Column(name = "miejsce", nullable = false)
    private Integer position;

    @Column(name = "nazwa_zawodow", nullable = false)
    private String eventName;

    @Column(name = "miejscowosc", nullable = false)
    private String locality;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_zawodnika", nullable = false)
    @Inject
    private ClubMember clubMember;

    public Integer getAchievementId() {
        return achievementId;
    }

    public void setAchievementId(Integer achievementId) {
        this.achievementId = achievementId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public ClubMember getClubMember() {
        return clubMember;
    }

    public void setClubMember(ClubMember clubMember) {
        this.clubMember = clubMember;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Achievement that = (Achievement) o;

        if (achievementId != null ? !achievementId.equals(that.achievementId) : that.achievementId != null)
            return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (eventName != null ? !eventName.equals(that.eventName) : that.eventName != null) return false;
        if (locality != null ? !locality.equals(that.locality) : that.locality != null) return false;
        return clubMember != null ? clubMember.equals(that.clubMember) : that.clubMember == null;

    }

    @Override
    public int hashCode() {
        int result = achievementId != null ? achievementId.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (eventName != null ? eventName.hashCode() : 0);
        result = 31 * result + (locality != null ? locality.hashCode() : 0);
        result = 31 * result + (clubMember != null ? clubMember.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Achievement{" +
                "achievementId=" + achievementId +
                ", date=" + date +
                ", position=" + position +
                ", eventName='" + eventName + '\'' +
                ", locality='" + locality + '\'' +
                ", clubMember=" + clubMember +
                '}';
    }
}
