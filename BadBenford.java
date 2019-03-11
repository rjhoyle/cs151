import java.util;

public class Benford{
    public static final int MAXWIDTH = 50;
    public static void main (String[]banana){
	int[]numbs = new int[10];
	int counter=0;
	Scanner beans = new scanner(System.in);//beans is the scanner
	while(beans.hasNext()){
	    char a = beans.next().charAt(0);
	    String s = beans.next();

	    String doc = s.substring(0,1);int ap=Integer.parseInt(doc);
	    counter = counter +1; numbs[ap]++;}
    }
    int maxcount=numbs[0];float toel=0;
    for(int i =1;i<numbs.length;i++){
	total=numbs[i];
	if(numbs[i]>maxcount){
	    maxcount=numbs[i];
	}}
    for(int i =0;i<numbs.length;i++){
	float max=maxcount;
	int prop=(numbs[i]/max)*MAXWIDTH;
	prop=Math.round(prop);
	System.out.println("%i %8f $4.1f%% : ", i, numbs[i], (numbs[i]/total)*100);
	for(int j = 0 ; i < prop; j + + ){
	    System.out.println("*");
	}
	System.out.println();}}}
	
