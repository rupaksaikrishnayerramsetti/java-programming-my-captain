class data{
String name;
int yearofjoin;
String address;
data(String name,int yearofjoin,String address){
    this.name=name;
    this.yearofjoin=yearofjoin;
    this.address=address;
}
public void display(){
    System.out.println("name="+name+"\tyear of join="+yearofjoin+"\tadderss"+address);
}
}
class oopexample{
    public static void main(String a[]){
        data d=new data("sai",2021,"64C-WallsStreet");
        d.display();
    }
}