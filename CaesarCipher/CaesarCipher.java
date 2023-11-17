/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rahul
 */
class CaesarCipher 
{
public static String encode(String enc,int offset){
  offset=offset%26+26;
  StringBuilder encoded=new StringBuilder();
  for(char i:enc.toCharArray()){
      if(Character.isLetter(i)){
          if(Character.isUpperCase(i)){
          encoded.append((char)('A'+(i-'A'+offset)%26));
            }else{
              encoded.append((char)('a'+(i-'a'+offset)%26));
          }
          }else{
              encoded.append(i);
             }
  }
        return encoded.toString();
}
    public static String decode(String enc,int offset){
        return encode(enc,26-offset);
      }
      public static void main(String[]args)throws java.lang.Exception{
          String msg="Anna University";
          System.out.println("Simulating caesar cipher\n--------------");
           System.out.println("Input:"+msg);
            System.out.println("Encrypted Message:");
             System.out.println(CaesarCipher.encode(msg,3));
              System.out.println("Decrypted message:");
               System.out.println(CaesarCipher.decode(CaesarCipher.encode(msg,3),3));
            } 
}
