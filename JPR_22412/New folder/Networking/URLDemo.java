import java.net.*; 
import java.util.*;   
public class UrlInfo{    
public static void main(String[] args){    
Scanner sc= new Scanner(System.in); 
System.out.print("Enter a string: ");
String URL= sc.nextLine();

try{    
InetAddress ip=InetAddress.getLocalHost();
URL url=new URL(URL);    
System.out.println("IP Add: "+ip.getHostAddress());
System.out.println("Protocol: "+url.getProtocol());    
System.out.println("Host Name: "+url.getHost());    
System.out.println("Port Number: "+url.getPort());    
System.out.println("Default Port Number: "+url.getDefaultPort());    
System.out.println("Query String: "+url.getQuery());    
System.out.println("Path: "+url.getPath());    
System.out.println("File: "+url.getFile());    
  
}catch(Exception e){System.out.println(e);}    


}    
}   