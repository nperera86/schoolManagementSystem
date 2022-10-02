package com.kelaniya.backend.entity.response;

public class LecturerNoteDetailsResponse {
  private String subject_name;
  private String description;
  private String academic_year;
  private String file_name;
  private long file_size;
  private String date;
  private String file_type;

  public LecturerNoteDetailsResponse(String subject_name, String description, String academic_year, String file_name, long file_size, String date, String file_type) {
    this.subject_name = subject_name;
    this.description = description;
    this.academic_year = academic_year;
    this.file_name = file_name;
    this.file_size = file_size;
    this.date = date;
    this.file_type = file_type;
  }

  public String getFile_type() {
    return file_type;
  }

  public void setFile_type(String file_type) {
    this.file_type = file_type;
  }

  public String getSubject_name() {
    return subject_name;
  }

  public void setSubject_name(String subject_name) {
    this.subject_name = subject_name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getAcademic_year() {
    return academic_year;
  }

  public void setAcademic_year(String academic_year) {
    this.academic_year = academic_year;
  }

  public String getFile_name() {
    return file_name;
  }

  public void setFile_name(String file_name) {
    this.file_name = file_name;
  }

  public long getFile_size() {
    return file_size;
  }

  public void setFile_size(long file_size) {
    this.file_size = file_size;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }
}
