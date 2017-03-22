package guru.springframework.model;

/**
 * Created by aacuna on 3/21/17.
 */

public class User {
    private String first;
    private String last;
//    private String jobtitle;
//    private String company;
//    private String email;
//    private String linkedin;

    public User(String first, String last) {
        this.setFirst(first);
        this.setLast(last);
//        this.setJobtitle(jobtitle);
//        this.setCompany(company);
//        this.setEmail(email);
//        this.setLinkedin(linkedin);
    }

    public void printPersonName() {
        System.out.print(this.getFirst() + ' ' + this.getLast());
    }

//    public String toString() {
//        String result = this.first + " " + this.last + " " + this.jobtitle + " " + this.company + " " + this.email + " " + this.linkedin;
//        return result;
//    }

    public String getFirst() {
        return this.first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return this.last;
    }

    public void setLast(String last) {
        this.last = last;
    }

//    public String getJobtitle() {
//        return this.jobtitle;
//    }
//
//    public void setJobtitle(String jobtitle) {
//        this.jobtitle = jobtitle;
//    }
//
//    public String getCompany() {
//        return this.company;
//    }
//
//    public void setCompany(String company) {
//        this.company = company;
//    }
//
//    public String getEmail() {
//        return this.email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getLinkedin() {
//        return this.linkedin;
//    }
//
//    public void setLinkedin(String linkedin) {
//        this.linkedin = linkedin;
//    }
}
