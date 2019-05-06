public class dd {
    public static void main(String args[]) {
      arraySort();      
            
       
       
    }
    
    public static  void arraySort(){
       int f[]={10,85,52,74,5,111,1,7};
          int temp;
          for(int i=0;i<f.length;i++){
            for(int j=i+1;j<f.length;j++){
                    if(f[i]>f[j]){
                        temp = f[i]; // {10,85,52,74,5};
                        f[i]=f[j];  //{5,85,52,74,5};
                        f[j]=temp; //{5,10,52,74,85};
                    }
                } 
            }
            for (int x:f){System.out.println(x);} 
        }
        
    
    public static String getExcelValue(String sheet,String path,int row, int col){
        File loc=new File(path);
        FlleInputStream in=new FlleInputStream(loc);
        Workbook w=new XSSFWorbook(in);
        String cell_value=w.getSheet(sheet).getRow(row).getCell(col).getStringCellValue();
        
    }

    
    public static void matchWbTableValue(){
        System.setProperty("webdriver.chrome.driver","c://sandib/chrome.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("url");
        driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
        List<WebElement> tRow=driver.findElements(By.tagName("tr"));
        for (int i=0;i<tRow.size() ;i++ ){
            List<WebElement> tData=tRow.get(i).findElements(By.tagName("td"));
            for (int j=0;j<tData.size() ;j++ ){
                String web_value=tData.get(j).getText();
                String excel_value=getExcelValue("sheet1","c://",i,j);
                //Assert.assertEqulas(web_valu,excel_value);
                if(web_valu.equals(excel_value)){
                    System.out.println(true);
                }
            } 
        } 
        
    }

    
    public static void matchExcelValue(){
        int row=10, col=20;
        for (int i=0;i<row ;i++ ){
            for (int j=0;j<col ;j++ ){
                String excel_value1=getExcelValue("sheet1","c://data1.xlsx",i,j);
                String excel_value2=getExcelValue("sheet1","c://data2.xlsx",i,j);         
            }
        } 
    }
    
    
    
    
    
        
        
    }
    
