import java.util.Scanner;

/*Un restaurante nos ha encargado una aplicación para colocar a los clientes en
sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales (mesa llena). 
Cuando llega un cliente se le pregunta cuántos son. 
De momento el programa no está preparado para colocar a grupos mayores a 4, por tanto, si un cliente dice por ejemplo que son un grupo de 6, 
el programa dará el mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
como máximo e intente de nuevo”. Para el grupo que llega, se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del programa se ilustra a continuación:*/
public class Ejercicio15T7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] comensales=new int[10];
        int invitados=0;
        int i;
        boolean mesalibre=false;
        for(i=0;i<10;i++){
            comensales[i]=(int)(Math.random()*5);
        }
        System.out.println("┌─────────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("|     Mesa    ");
        for(i=1;i<=10;i++){
            System.out.printf("| %d ",i);
        }
        System.out.println("|");
        System.out.println("├─────────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("| Comensales  ");
        for(i=1;i<=10;i++){
            System.out.printf("| %d ",comensales[i-1]);
        }
        System.out.println("|");
        System.out.println("└─────────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
        System.out.print("Nuestras mesas admiten hasta un máximo de 4 personas ¿Cuántas personas son?: ");
        do{
            invitados=Integer.parseInt(s.nextLine());
            if(invitados>4){
                System.out.println("Lo siento, no admitimos grupos de "+invitados+" haga grupos de 4 personas como máximo e intente de nuevo");
            }
        }while(invitados);
        for(int n:comensales){
            if(n-invitados>=0){
                mesalibre=true;
            }else{
                mesalibre=false;
            }
        }
        do{
            
        }
    }
}