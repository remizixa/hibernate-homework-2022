package ru.hh.school.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

//TODO: оформите entity

@Entity
public class Vacancy {

  @Id
  @Column(name = "vacancy_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @ManyToOne
  @JoinColumn(name = "employer_id")
  private Employer employer;

  @OneToOne
  @JoinColumn(name = "area_id")
  private Area area;

  private String title;

  private String description;

  @Column(name = "compensation_from")
  private Integer compensationFrom;

  @Column(name = "compensation_to")
  private Integer  compensationTo;

  @Column(name = "compensation_gross")
  private Boolean compensationGross;

  @Column(name = "creation_time")
  private LocalDateTime creationTime;

  @Column(name = "archiving_time")
  private LocalDateTime archivingTime;

  public Vacancy() {
  }

  public Vacancy(Employer employer) {
    this.employer = employer;
  }

  public Integer getId() {
    return id;
  }

  public Area getArea() { return area; }

  public void setArea(Area area) {
    this.area = area;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) { this.description = description; }

  public Employer getEmployer() {
    return employer;
  }

  public void setEmployer(Employer employer) {
    this.employer = employer;
  }

  public Integer getCompensationFrom() {
    return compensationFrom;
  }

  public void setCompensationFrom(Integer compensationFrom) { this.compensationFrom = compensationFrom; }

  public Integer getCompensationTo() {
    return compensationTo;
  }

  public void setCompensationTo(Integer compensationTo) {
    this.compensationTo = compensationTo;
  }

  public LocalDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(LocalDateTime creationTime) {
    this.creationTime = creationTime;
  }

  public LocalDateTime getArchivingTime() {
    return archivingTime;
  }

  public void setArchivingTime(LocalDateTime archivingTime) {
    this.archivingTime = archivingTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Vacancy vacancy = (Vacancy) o;
    return Objects.equals(id, vacancy.id);
  }

  @Override
  public int hashCode() {
    return 17;
  }

}
