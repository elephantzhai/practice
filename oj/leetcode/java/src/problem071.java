import java.util.Stack;


public class problem071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pathString = "/a/./b/../../c/";
		String resString = simplifyPath(pathString);
		System.out.println("res:"+resString);
	}
	
	public static String simplifyPath(String path) {
        if(path == null || path.length()==0 ){
        	return "";
        }
        Stack<String> stack = new Stack<String>();
        String[] strs = path.split("/");
        for(String str:strs){
        	if(str.equals("..")){
        		if(!stack.isEmpty())
        			stack.pop();
        	}else if(str.equals(".")||str.length()==0){
        		
        	}else{
        		stack.push(str);
        	}
        }
        if(stack.isEmpty()){
        	return "/";
        }else{
        	StringBuilder sb = new StringBuilder();
        	while(!stack.isEmpty()){
        		sb.insert(0, stack.pop());
        		sb.insert(0, '/');
        	}
        	return sb.toString();
        }
    }

}
