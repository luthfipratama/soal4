package mainmember;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMember {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
        ArrayList<Member> listmember = new ArrayList();
    Member m1 = new Member();
    Member m2 = new Member();
    Member m3 = new Member();
    listmember.add(m1);
    
        System.out.println("List Member");
        System.out.print("Nama : ");
        listmember.get(0).setNama(scan.nextLine());
        System.out.print("Team : ");
        listmember.get(0).setTeam(scan.nextLine());
        System.out.print("Umur : ");
        listmember.get(0).setUmur(scan2.nextInt());
        System.out.print("Penampilan : ");
        listmember.get(0).setPenampilan(scan2.nextInt());
        System.out.print("Suara : ");
        listmember.get(0).setSuara(scan2.nextInt());
        System.out.print("Attitude : ");
        listmember.get(0).setAtitude(scan2.nextInt());
        System.out.println("");
        
        listmember.add(m2);
        System.out.print("Nama : ");
        listmember.get(1).setNama(scan.nextLine());
        System.out.print("Team : ");
        listmember.get(1).setTeam(scan.nextLine());
        System.out.print("Umur : ");
        listmember.get(1).setUmur(scan2.nextInt());
        System.out.print("Penampilan : ");
        listmember.get(1).setPenampilan(scan2.nextInt());
        System.out.print("Suara : ");
        listmember.get(1).setSuara(scan2.nextInt());
        System.out.print("Attitude : ");
        listmember.get(1).setAtitude(scan2.nextInt());
        System.out.println("");
        
        
        listmember.add(m3);
        System.out.print("Nama : ");
        listmember.get(2).setNama(scan.nextLine());
        System.out.print("Team : ");
        listmember.get(2).setTeam(scan.nextLine());
        System.out.print("Umur : ");
        listmember.get(2).setUmur(scan2.nextInt());
        System.out.print("Penampilan : ");
        listmember.get(2).setPenampilan(scan2.nextInt());
        System.out.print("Suara : ");
        listmember.get(2).setSuara(scan2.nextInt());
        System.out.print("Attitude : ");
        listmember.get(2).setAtitude(scan2.nextInt());
        System.out.println("");
        
        System.out.println("Daftar Member : ");
        for(int i =0;i<=2;i++){
            System.out.println("Nama : "+listmember.get(i).getNama());        
            System.out.println("Umur : "+listmember.get(i).getUmur());
            System.out.println("Team : "+listmember.get(i).getTeam());
            System.out.println("Nilai Total : "+listmember.get(i).getNilai());
            System.out.println("---------------------------------------");
        }
    }

}
