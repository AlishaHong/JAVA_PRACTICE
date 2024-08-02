package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit("유경", 20, 100);

        MemberInit member2 = new MemberInit("맹석", 30, 100);

        MemberInit[] members = {member1, member2};
        
        for (MemberInit s : members) {
            System.out.println("이름:"+ s.name + " 나이 : "+ s.age+ " 성적:"+ s.grade);
        }
    }
}
