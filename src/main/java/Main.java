public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 №444444";
        post.patronymic = "Иванович";
        post.phone = "+7(977)777 77 77";
        post.surname = "Иванов";
        post.subscription = true;


        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 12;
        post.birthday.year = 2_024;

    }
}
