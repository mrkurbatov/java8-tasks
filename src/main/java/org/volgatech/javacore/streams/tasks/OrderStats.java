package org.volgatech.javacore.streams.tasks;

import org.volgatech.javacore.streams.model.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Этот класс иммет несколько методов для получения стастической информации по покупателмя и заказам в интернет-мазазине.
 * Используя Java 8 Stream API, реализуйте методы класса
 * Каждый метод иммет юнит-тесты. Вы можете использовать вызов <code>mvn test</code>, чтобы проверить вашу реализацию
 *
 * Доменная модель магазина находиться в пакете <code>org.volgatech.javacore.streams.model</code>.
 */
class OrderStats {

  /**
   * Task 1 (⚫⚫⚪⚪⚪)
   * <p>
   * Имея стрим пользователей, верните список заказов, которые оплачены определенным типом карты (Visa или MasterCard)
   *
   * @param customers stream of customers
   * @param cardType  credit card type
   * @return list, containing orders paid with provided card type
   */
  static List<Order> ordersForCardType(final Stream<Customer> customers, PaymentInfo.CardType cardType) {
    return null;
  }

  /**
   * Task 2 (⚫⚫⚪⚪⚪)
   * <p>
   * Имея стрим заказов, верните отображение, где ключами являются различные размеры заказов а ключами ключами список заказов,
   * ссылающимися на этот размер. Размер заказа - это общее количество продуктов в заказе.
   *
   * @param orders stream of orders
   * @return map, where order size values mapped to lists of orders
   */
  static Map<Integer, List<Order>> orderSizes(final Stream<Order> orders) {
    return null;
  }

  /**
   * Task 3 (⚫⚫⚫⚪⚪)
   * <p>
   * Имея стрим заказов, верните true, только если каждый продукт в заказе содержит хотя бы
   * один продукт заданного цвета, иначе верните false
   *
   * @param orders stream of orders
   * @param color  product color to test
   * @return boolean, representing if every order in the stream contains product of specified color
   */
  static Boolean hasColorProduct(final Stream<Order> orders, final Product.Color color) {
    return null;
  }

  /**
   * Task 4 (⚫⚫⚫⚫⚪)
   * <p>
   * Имея стрим пользователей, верните отображение, где email пользователя отображается на количество различных кредитных карт,
   * использованных для оплаты этим пользователям
   *
   * @param customers stream of customers
   * @return map, where for each customer email there is a long referencing a number of different credit cards this customer uses.
   */
  static Map<String, Long> cardsCountForCustomer(final Stream<Customer> customers) {
    return null;
  }

  /**
   * Task 5 (⚫⚫⚫⚫⚫)
   * <p>
   * Имея стрим покупателей, верните Optional, содержащий самое популярное название страны.
   * Название страны, которое чаще всего используется в addressInfo у покупателя.
   * Если меются две или более страны с одинаковой частотой использования у покупателей, верните название страны наименьшей длины
   * Если стрим покупателей пустой, Optional.empty должен быть возвращен
   * <p>
   * Пример: Стрим, содержащий
   * Customer#1 -> USA
   * Customer#2 -> France
   * Customer#3 -> Japan
   * Customer#4 -> USA
   * Customer#5 -> Japan
   * <p>
   * "USA" должно быть возвращено.
   *
   * @param customers stream of customers
   * @return java.util.Optional containing the name of the most popular country
   */
  static Optional<String> mostPopularCountry(final Stream<Customer> customers) {
    return null;
  }

  /**
   * Task 6 (⚫⚫⚫⚫⚫)
   * <p>
   * Имея стрим покупателей, верните среднюю стоимость продуктов, оплаченных кредитной картой с заданным номером
   * <p>
   * Если заказ содержит, следующие продукты:
   * [
   * Product1(price = 100$, quantity = 2),
   * Product2(price = 160$, quantity = 1)
   * ]
   * тогда средняя стоимость продуктов будет 120$ ((100 * 2 + 160 * 1) / 3)
   * <p>
   * Так как цена продукта представлена как BigDecimal, необходимо использовать кастомный коллектор AveragingBigDecimalCollector
   *
   * @param customers  stream of customers
   * @param cardNumber card number to check
   * @return average price of the product, ordered with the provided card
   */
  static BigDecimal averageProductPriceForCreditCard(final Stream<Customer> customers, final String cardNumber) {
    return null;
  }
}