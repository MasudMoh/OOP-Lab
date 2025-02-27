public class Hello{
    public static void main(String [] args){
        System.out.println("Hello from main branch!");
    }
    public void mainBranchMethod(){
        System.out.println("This is a method from main branch");
        System.out.println("Hello from the mergeBranch");
    }
        public void mergeBranchMethod(){
        System.out.println("Hello from the mergeBranch");
    } 
}