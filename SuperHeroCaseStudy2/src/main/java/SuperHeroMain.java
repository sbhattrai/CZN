import controller.SuperHeroController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SuperHeroMain {


    public static void main (String args[]) {
//        SuperHeroDao dao= new SuperHeroInMemory(SuperHeroData.getProdData());
//        SuperHeroRunner View = new SuperHeroView();
//        SuperHeroServiceImpl service = new SuperHeroServiceImpl(dao);
//        SuperHeroController c = new SuperHeroController(View, service);

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        SuperHeroController controller = ctx.getBean("Controller", SuperHeroController.class);

    }
}
