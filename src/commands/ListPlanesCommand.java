package commands;

import models.Aircraft;
import models.Airline;
import java.util.List;

/**
 * Команда для виведення інформації про всі літаки авіакомпанії.
 */
public class ListPlanesCommand implements Command {
    private Airline airline;

    /**
     * Конструктор, що приймає посилання на авіакомпанію.
     *
     * @param airline Авіакомпанія, для якої виводиться інформація про літаки.
     */
    public ListPlanesCommand(Airline airline) {
        this.airline = airline;
    }

    /**
     * Виводить інформацію про всі літаки авіакомпанії.
     */
    @Override
    public void execute() {
        System.out.println("―――――――― Інформація про всі літаки: ―――――――");

        List<Aircraft> aircrafts = airline.getAircrafts();

        if (aircrafts.isEmpty()) {
            System.out.println("У авіакомпанії немає жодного літака.");
        } else {
            for (Aircraft aircraft : aircrafts) {
                System.out.println(" Виробник: " + aircraft.getManufacturer());
                System.out.println(" Модель: " + aircraft.getModel());
                System.out.println(" Серійний номер: " + aircraft.getSerialNumber());
                System.out.println(" Місткість: " + aircraft.getCapacity());
                System.out.println(" Вантажопідйомність: " + aircraft.getCargoCapacity());
                System.out.println(" Споживання пального: " + aircraft.getFuelConsumption());
                System.out.println(" Дальність польоту: " + aircraft.getFlightRange());
                System.out.println("―――――――――――――――――――――――――――――――――――――――――――");
            }
        }
    }

    /**
     * Повертає опис команди.
     *
     * @return Опис команди для використання в меню.
     */
    @Override
    public String getDescription() {
        return "Вивести всі літаки";
    }
}
