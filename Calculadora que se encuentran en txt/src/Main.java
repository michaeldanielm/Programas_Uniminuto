import java.io.*;
public class Main{
    public static void operacion(String chain){
        String n1="",n2="",n3="";
        char operando1=' ',operando2=' ';
        int num1, num2,num3,cont=0,result,val1=0,val2=0;
        while(cont!=(chain.length())){
            if(chain.charAt(cont)=='+'||chain.charAt(cont)=='-'||chain.charAt(cont)=='*'||chain.charAt(cont)=='/'||chain.charAt(cont)=='%'){
                if(operando1!=' '){
                    operando2=chain.charAt(cont);
                    val2++;
                }else{
                    operando1=chain.charAt(cont);
                    val1++;
                }
            }else{
                if(val2!=0){
                    n3=n3+chain.charAt(cont);
                }else{
                    if(val1!=0){
                        n2=n2+chain.charAt(cont);
                    }else{
                        n1=n1+chain.charAt(cont);
                    }
                }
            }
            cont++;
        }
        num1=Integer.parseInt(n1);
        num2=Integer.parseInt(n2);
        num3=Integer.parseInt(n3);
        if(operando1=='+'){
            if(operando2=='+'){
                result=num1+num2+num3;
                System.out.println(num1+"+"+num2+"+"+num3+"="+result);
            }else{
                if(operando2=='-'){
                    result=num1+num2-num3;
                    System.out.println(num1+"+"+num2+"-"+num3+"="+result);
                }else{
                    if(operando2=='*'){
                        result=num1+(num2*num3);
                        System.out.println(num1+"+"+num2+"*"+num3+"="+result);
                    }else{
                        if(operando2=='/'){
                            result=num1+(num2/num3);
                            System.out.println(num1+"+"+num2+"/"+num3+"="+result);
                        }else{
                        result=num1+(num2%num3);
                        System.out.println(num1+"+"+num2+"%"+num3+"="+result);
                        }
                    }
                }
            }
        }else{
            if(operando1=='-'){
                if(operando2=='+'){
                result=num1-num2+num3;
                System.out.println(num1+"-"+num2+"+"+num3+"="+result);
                }else{
                    if(operando2=='-'){
                    result=num1-num2-num3;
                    System.out.println(num1+"-"+num2+"-"+num3+"="+result);
                    }else{
                        if(operando2=='*'){
                        result=num1-(num2*num3);
                        System.out.println(num1+"-"+num2+"*"+num3+"="+result);
                        }else{
                            if(operando2=='/'){
                            result=num1-(num2/num3);
                            System.out.println(num1+"-"+num2+"/"+num3+"="+result);
                            }else{
                            result=num1-(num2%num3);
                            System.out.println(num1+"-"+num2+"%"+num3+"="+result);
                            }
                        }
                    }
                }
            }else{
                if(operando1=='*'){
                    if(operando2=='+'){
                    result=(num1*num2)+num3;
                    System.out.println(num1+"*"+num2+"+"+num3+"="+result);
                    }else{
                        if(operando2=='-'){
                        result=(num1*num2)-num3;
                        System.out.println(num1+"*"+num2+"-"+num3+"="+result);
                        }else{
                            if(operando2=='*'){
                            result=num1*num2*num3;
                            System.out.println(num1+"*"+num2+"*"+num3+"="+result);
                            }else{
                                if(operando2=='/'){
                                result=num1*num2/num3;
                                System.out.println(num1+"*"+num2+"/"+num3+"="+result);
                                }else{
                                result=num1*(num2%num3);
                                System.out.println(num1+"*"+num2+"%"+num3+"="+result);
                                }
                            }
                        }
                    }
                }else{
                    if(operando1=='/'){
                        if(operando2=='+'){
                        result=(num1/num2)+num3;
                        System.out.println(num1+"/"+num2+"+"+num3+"="+result);
                        }else{
                            if(operando2=='-'){
                            result=(num1/num2)-num3;
                            System.out.println(num1+"/"+num2+"-"+num3+"="+result);
                            }else{
                                if(operando2=='*'){
                                result=num1/num2*num3;
                                System.out.println(num1+"/"+num2+"*"+num3+"="+result);
                                }else{
                                    if(operando2=='/'){
                                    result=num1/num2/num3;
                                    System.out.println(num1+"/"+num2+"/"+num3+"="+result);
                                    }else{
                                    result=num1/(num2%num3);
                                    System.out.println(num1+"/"+num2+"%"+num3+"="+result);
                                    }
                                }
                            }
                        }
                    }else{
                        if(operando2=='+'){
                        result=(num1%num2)+num3;
                        System.out.println(num1+"%"+num2+"+"+num3+"="+result);
                        }else{
                            if(operando2=='-'){
                            result=(num1%num2)-num3;
                            System.out.println(num1+"%"+num2+"+"+num3+"="+result);
                            }else{
                                if(operando2=='*'){
                                result=(num1%num2)*num3;
                                System.out.println(num1+"%"+num2+"*"+num3+"="+result);
                                }else{
                                    if(operando2=='/'){
                                    result=(num1%num2)/num3;
                                    System.out.println(num1+"%"+num2+"/"+num3+"="+result);
                                    }else{
                                    result=num1%num2%num3;
                                    System.out.println(num1+"%"+num2+"%"+num3+"="+result);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public static void leerArchivo(String File) throws FileNotFoundException, IOException{
        String chain;
        
        FileReader fr=new FileReader(File);
        BufferedReader br=new BufferedReader(fr);
        while((chain = br.readLine())!=null) {
            operacion(chain);
            System.out.println("");
        }
        br.close();
    }
    public static void main(String [] args) throws IOException{
        String dir="C:\\Users\\User\\Documents\\NetBeansProjects\\Calculadora que se encuentran en txt\\operaciones.txt";
        leerArchivo(dir);
    }
}