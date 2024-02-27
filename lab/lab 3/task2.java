// interface Media {
//     void display();
// }

// class PrintMedia implements Media {
//     protected String title;

//     public void setTitle(String title) {
//         this.title = title;
//     }

//     // @Override
//     public void display() {
//         System.out.println("Title: " + title);
//     }
// }

// class SocialMedia implements Media {
//     protected String title;

//     public void setTitle(String title) {
//         this.title = title;
//     }

//     // @Override
//     public void display() {
//         System.out.println("Title: " + title);
//     }
// }

// class Book extends PrintMedia {
//     String name;
//     String ISBN;

//     // Write default and parameterized constructor

//     // defaullt constructor
//     Book() {

//     }

//     // Parameterized constructor
//     Book(String name, String ISBN) {
//         this.name = name;
//         this.ISBN = ISBN;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public void setISBN(String ISBN) {
//         this.ISBN = ISBN;
//     }

//     // public void setTitle(String title) {
//     // this.title = title;
//     // }

//     String getName() {
//         return name;
//     }

//     String getISBN() {
//         return ISBN;
//     }

//     // String getTitle() {
//     // return title;
//     // }

//     // override method
//     // @Override
//     public void display() {
//         System.out.println("Book -> Title: " + title + ", Name: " + name + ", ISBN: " + ISBN);
//     }
// }

// class Magazine extends PrintMedia {
//     String month;
//     int year;

//     // Write default and parameterized constructor

//     // default constructor
//     Magazine() {

//     }

//     // Parameterized constructor
//     Magazine(String month, int year) {
//         this.month = month;
//         this.year = year;
//     }

//     // public void setTitle(String title) {
//     // this.title = title;
//     // }

//     public void setMonth(String month) {
//         this.month = month;
//     }

//     public void setYear(int year) {
//         this.year = year;
//     }

//     // String getTitle() {
//     // return title;
//     // }

//     String getMonth() {
//         return month;
//     }

//     int getYear() {
//         return year;
//     }

//     // override
//     // @Override
//     public void display() {
//         System.out.println("Magazine -> Title: " + title + ", Month: " + month + ", Year: " + year);
//     }
// }

// class Facebook extends SocialMedia {
//     String name;
//     String likes;

//     // Write default and parameterized constructor

//     // default constructor
//     Facebook() {

//     }

//     // Parameterized constructor
//     Facebook(String name, String likes) {
//         this.name = name;
//         this.likes = likes;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public void setLikes(String likes) {
//         this.likes = likes;
//     }

//     // public void setTitle(String title) {
//     // this.title = title;
//     // }

//     // String getTitle() {
//     // return title;
//     // }

//     String getName() {
//         return name;
//     }

//     String getLikes() {
//         return likes;
//     }

//     // override
//     // @Override
//     public void display() {
//         System.out.println("Facebook -> Title: " + title + ", Name: " + name + ", Likes: " + likes);
//     }
// }

// public class task2 {
//     public static void main(String[] args) {
//         Media[] mediaArray = new Media[10];

//         mediaArray[0] = new Book("Book1", "ISBN1");
//         mediaArray[1] = new Magazine("January", 2024);
//         mediaArray[2] = new Facebook("Facebook1", "1000");

//         for (Media media : mediaArray) {
//             if (media != null) {
//                 media.display();
//             }
//         }
//     }
// }
