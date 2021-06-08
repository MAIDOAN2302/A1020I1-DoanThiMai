package common;

public class Regex {
    private static String regex = "";

    public static boolean checkNameCustomer(String str){
        regex="^[A-Z][\\w]+([\\s][A-Z][\\w]+)*$";
        return str.matches(regex);
    }
    public static boolean regexPhone(String phoneNumber){
        regex = "(84|0[3|5|7|8|9])+([0-9]{8})\\b";
        return phoneNumber.matches(regex);
    }

    public static boolean regexCustomerId(String idCustomer){
        regex = "^KH-[0-9]{4}$";
        return idCustomer.matches(regex);
    }

    public static boolean regexServiceId(String idService){
        regex = "^DV-[0-9]{4}$";
        return idService.matches(regex);
    }

    public static boolean regexIdentify(String idService){
        regex = "^DV-[0-9]{4}$";
        return idService.matches(regex);
    }

    public static boolean regexEmail(String email){
        regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return email.matches(regex);
    }

    public static boolean regexDate(String date){
        regex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        return date.matches(regex);
    }

    public static boolean regexPeopleAndFloor(String count){
        regex = "^[0-9]{2}";
        return count.matches(regex);
    }

}
