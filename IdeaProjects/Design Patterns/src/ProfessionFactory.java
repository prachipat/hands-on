public class ProfessionFactory {
    public  static Profession getProfession(String prof){
        if(prof.equalsIgnoreCase("Doctor")){
            return new Doctor();
        } else if (prof.equalsIgnoreCase("Engineer")) {
            return new Engineer();
        }
        return new Doctor();
    }
}

