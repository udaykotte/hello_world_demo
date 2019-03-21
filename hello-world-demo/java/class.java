 public void writefile(){

    try{
        Writer output = null;
        File file = new File("results.txt");
        output = new BufferedWriter(new FileWriter(file));

        for(int i=0; i<100; i++){
           //CODE TO FETCH RESULTS AND WRITE FILE
        }

        output.close();
        System.out.println("File has been written");

    }catch(Exception e){
        System.out.println("Could not create file");
    }
}