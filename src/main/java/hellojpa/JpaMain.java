package hellojpa;

import javax.persistence.*;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try{
            Member member = new Member();
            member.setId(27L);
            member.setUsername("Banker");
            member.setRoleType(RoleType.ADMIN);

            em.persist(member);

            tx.commit();

//            Member member = new Member(200l,"member200");
//            em.persist(member);
//            em.flush();
//            System.out.println("================================");



            //            member.setName("ZZZZZ");
//
//
//            System.out.println("++++++++++++++++++++++++++++++++");

            //            Member member1 = new Member(150l, "A");
//            Member member2 = new Member(160l, "B");
//
//            em.persist(member1);
//            em.persist(member2);

//            Member findMember1 = em.find(Member.class, 101L);
//            Member findMember2 = em.find(Member.class, 101L);
//            Member member = new Member();
//            member.setId(101L);
//            member.setName("HelloJPA");

//            System.out.println("=== BEFORE ===");
//            em.persist(member);
//            System.out.println("=== AFTER ===");

//            Member findMember = em.find(Member.class, 101L);
//            System.out.println("findMember.id = " + findMember.getId());
//            System.out.println("findMember.name = " + findMember.getName());


            //            List<Member> result = em.createQuery("select m from Member as m", Member.class).getResultList();
//            for(Member member : result){
//                System.out.println("member.name = " + member.getName());
//            }
//            Member member = new Member(); 데이터 삽입
//            member.setId(2L);
//            member.setName("HelloB");
//            em.persist(member);
            // 데이터 수정
//            Member findMember = em.find(Member.class, 1L); // 가져오면 JPA가 엔티티 관리
//            System.out.println("findMember.id = " + findMember.getId());
//            System.out.println("findMember.name = " + findMember.getName());
//
//            findMember.setName("HelloJPA"); // 수정, tx 커밋 전 update 쿼리 작성
//            tx.commit();
            //em.remove(findMember); // 삭제


        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();
    }
}