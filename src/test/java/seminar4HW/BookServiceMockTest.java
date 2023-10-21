package seminar4HW;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class BookServiceMockTest {
    private BookRepository bookRepository;
    private BookService bookService;

    @Before
    public void setUp() {
        // Создаем мок-объект bookRepository
        bookRepository = mock(BookRepository.class);
        // Создаем экземпляр bookService, передавая мок-объект bookRepository
        bookService = new BookService(bookRepository);
    }

    @Test
    @DisplayName("Проверка поиска книги по id")
    public void testFindBookById() {

        /* Настройка тестовых данных
           Объявляем переменную id типа String со значением "1"
           Создаем объект book типа Book с переданными параметрами
        */
        String id = "1";
        Book book = new Book(id, "Крадущийся в тени", "Пехов Алексей");

        // Устанавливаем, что при вызове findById с id должен вернуться объект book
        when(bookRepository.findById(id)).thenReturn(book);

        // Вызываем метод findBookById с заданным параметром id = 1
        Book result = bookService.findBookById(id);

        // Проверяем, что findById был вызван 1 раз
        verify(bookRepository, times(1)).findById(id);

        // Проверяем результаты
        assertEquals(book, result);
    }

    @Test
    @DisplayName("Проверка поиска всех книг")
    public void testFindAllBook() {

        // Создаем список books с переданными параметрами
        List<Book> books = Arrays.asList(
                new Book("1", "Крадущийся в тени", "Пехов Алексей"),
                new Book("2", "Зов Ктулху", "Лавкрафт Говард Филлипс"),
                new Book("3", "Изгой", "Михайлов Дем")
        );

        // Устанавливаем, что при вызове findAll должен вернуться объект books
        when(bookRepository.findAll()).thenReturn(books);

        // Вызываем метод findAllBooks
        List<Book> result = bookService.findAllBooks();

        // Проверяем, что findAllBooks был вызван 1 раз
        verify(bookRepository, times(1)).findAll();

        // Проверяем результаты
        assertEquals(books, result);
    }
}
