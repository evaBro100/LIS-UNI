import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Condition;
import org.junit.Test;

public class TestSelenide {
//    @Test
//    public void testGoogle(){
//        open("https://www.google.ru/");
//        $x("//textarea[@name='q']").setValue("Ева Харченко").pressEnter();
//        $x("//div[@id='result-stats']").shouldBe(Condition.visible);
//        sleep(5000);
//    }

    //1.клик на главную
    @Test
    public void testTaishetToMain(){
        open("https://taishet38.ru/");
        $x("//div[@class='col-auto ml-2']").shouldBe(Condition.visible);
        $x("//div[@class='col-auto ml-2']").click();
        sleep(5000);
    }

    //2. клик на войти
    @Test
    public void testTaishetToIn(){
        open("https://taishet38.ru/");
        $x("//div[@class='col-auto mr-2']").click();
        $x("//form[@class='form-signin shadow']").shouldBe(Condition.visible);
        sleep(5000);
    }

    //3. проверка клика на "Расширили зоны доставки"
    @Test
    public void testTaishetToDelivery(){
        open("https://taishet38.ru/");
        $x("//div[@class='col pl-1']").shouldBe(Condition.visible);
        $x("//div[@class='col pl-1']").click();
        sleep(5000);
    }

    //4. проверка клика открытия на я.картах
    @Test
    public void testTaishetToYaMap(){
        open("https://taishet38.ru/main/area_map");
        $x("//span[@class='map-widget-layout-view__maps-links']").shouldBe(Condition.visible);
//        $x("//a[@href='https://yandex.ru/maps/?from=mapframe&ll=104.333406%2C52.228371&source=mapframe&um=constructor%3A5f25570fcd6bddf96cbe9daf18905897bdf31b1a7994e37c2f22d0accc485e6f&utm_source=mapframe&z=10']").click();
        sleep(5000);
    }

    //5. проверка клика открытия первой акции
    @Test
    public void testTaishetSales(){
        open("https://taishet38.ru/");
        $x("//div[@class='btn btn-default button-rounded-36 shadow-sm float-bottom-right']").shouldBe(Condition.visible);
        $x("//div[@class='btn btn-default button-rounded-36 shadow-sm float-bottom-right']").click();
        sleep(5000);
    }

    //6. переход на страницу Смотреть все
    @Test
    public void testTaishetLookAllSmall(){
        open("https://taishet38.ru/");
        $x("//a[@class='float-right small']").shouldBe(Condition.visible);
        $x("//a[@class='float-right small']").click();
        sleep(5000);
    }

    //7. Проверка фильтра
    @Test
    public void testTaishetFilter(){
        open("https://taishet38.ru/main/stocks");
        $x("//div[@class='col-12 mb-2']").shouldBe(Condition.visible);
        $x("//div[@class='badge-new me-2 mb-3 shadow-sm']").click();
        sleep(5000);
    }

    //8. Проверка открытия статьи
    @Test
    public void testTaishetArticle(){
        open("https://taishet38.ru/main/stocks");
        $x("//a[@href='https://taishet38.ru/main/news/darim-podarok-na-pervyy-zakaz-s-prilojeniya']").click();
        sleep(5000);
    }

    //9.Нажать на карточку товара
    @Test
    public void testTaishetClickSushi(){
        open("https://taishet38.ru");
        $x("//div[@class='card shadow-sm mb-4 sizeup card_product']").shouldBe(Condition.visible);
        $x("//div[@class='card shadow-sm mb-4 sizeup card_product']").click();

        sleep(5000);
    }

    //10.Добавить товар в корзину
    @Test
    public void testTaishetAddToCard(){
        open("https://taishet38.ru");
        $x("//div[@class='card shadow-sm mb-4 sizeup card_product']").shouldBe(Condition.visible);
        $x("//div[@class='card shadow-sm mb-4 sizeup card_product']").click();
        $x("//button[@class='btn btn-default btn-add-product mr-1']").click();
        $x("//button[@class='btn btn-primary mr-1']").click();
        sleep(5000);
    }

    //11.Отзыв о продукте
    @Test
    public void testTaishetViewReview(){
        open("https://taishet38.ru");
        $x("//div[@class='card shadow-sm mb-4 sizeup card_product']").shouldBe(Condition.visible);
        $x("//div[@class='card shadow-sm mb-4 sizeup card_product']").click();
        $x("//button[@class='btn btn-default btn-add-product mr-1']").click();
        $x("//div[@class='text-center mb-4']").click();
        sleep(5000);
    }

    //12.Открыть корзину
    @Test
    public void testTaishetCard(){
        open("https://taishet38.ru");
        $x("//a[@class='btn btn-default shadow centerbutton basket open-btn-info-product']").shouldBe(Condition.visible);
        $x("//a[@class='btn btn-default shadow centerbutton basket open-btn-info-product']").click();
        sleep(5000);
    }

    //13.Очистка корзины
    @Test
    public void testTaishetCardClean(){
        open("https://taishet38.ru");
        $x("//div[@class='card shadow-sm mb-4 sizeup card_product']").shouldBe(Condition.visible);
        $x("//div[@class='card shadow-sm mb-4 sizeup card_product']").click();
        $x("//button[@class='btn btn-default btn-add-product mr-1']").click();
        $x("//button[@class='btn btn-primary mr-1']").click();
        $x("//a[@class='btn btn-default shadow centerbutton basket open-btn-info-product']").shouldBe(Condition.visible);
        $x("//a[@class='btn btn-default shadow centerbutton basket open-btn-info-product']").click();
        $x("//a[@class='text-secondary small text-decoration-none']").click();

        sleep(6000);
    }

    //14.Поиск
    @Test
    public void testTaishetSearch(){
        open("https://taishet38.ru");
        $x("//input[@class='form-control form-control-lg search my-3']").setValue("Тазик").pressEnter();
        $x("//div[@class='col-12 col-md-6 col-lg-4 col-xl-3 mt-2 desctop_productInfo']").shouldBe(Condition.visible);
        sleep(4000);
    }

    //15. Перезвоните
    @Test
    public void testTaishetCallBack(){
        open("https://taishet38.ru");
        $x("//div[@class='callback-bt']").shouldBe(Condition.visible);
        $x("//div[@class='callback-bt']").click();
        sleep(4000);
    }

    //16. Блок перезвоните - переход на Вк
    @Test
    public void testTaishetCallBackVk(){
        open("https://taishet38.ru");
        $x("//div[@class='callback-bt']").shouldBe(Condition.visible);
        $x("//div[@class='callback-bt']").click();
        $x("//a[@class='mr-3 mt-3']").click();
        sleep(5000);
    }

    //17. Открытие статьи снизу
    @Test
    public void testTaishetArticlesBottom(){
        open("https://taishet38.ru");
//        $x("//a[@class='btn btn-default button-rounded-36 shadow-sm float-bottom-right']").shouldBe(Condition.visible);
        $x("//a[@href='https://taishet38.ru/main/news/1c152a7f-a819-6f7b-622e-657c14673613']").click();
        sleep(5000);
    }

    //18.Меню бургер - почему не работает
    @Test
    public void testTaishetBurgerMenu(){
        open("https://taishet38.ru");
        $x("//div[@class='col-2 col-xl-1']").shouldBe(Condition.visible);
        $x("//svg[@class='menu-btn']").click();
        sleep(5000);
    }

    //19.Информация о блюде
    @Test
    public void testTaishetInfoCard(){
        open("https://taishet38.ru");
        $x("//div[@class='card shadow-sm mb-4 sizeup card_product']").shouldBe(Condition.visible);
        $x("//div[@class='card shadow-sm mb-4 sizeup card_product']").click();
        $x("//div[@class='modal-product-scroll-content']").shouldBe(Condition.visible);
        sleep(4000);
    }

    //20.Ввод номера телефона
    @Test
    public void testTaishetTel(){
        open("https://taishet38.ru/");
        $x("//div[@class='col-auto mr-2']").click();
        $x("//form[@class='form-signin shadow']").shouldBe(Condition.visible);
        $x("//input[@class='form-control']").setValue("89822636130").pressEnter();
        sleep(5000);
    }

}
