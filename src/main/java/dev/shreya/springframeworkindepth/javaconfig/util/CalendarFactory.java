package dev.shreya.springframeworkindepth.javaconfig.util;

import java.util.Calendar;
import org.springframework.beans.factory.FactoryBean;

public class CalendarFactory implements FactoryBean<Calendar> {
  private Calendar calendar = Calendar.getInstance();
  @Override
  public Calendar getObject() throws Exception {
    return calendar;
  }

  @Override
  public Class<?> getObjectType() {
    return Calendar.class;
  }

  @Override
  public boolean isSingleton() {
    return FactoryBean.super.isSingleton();
  }

  public void addDays(int days) {
    calendar.add(Calendar.DAY_OF_YEAR,days);
  }
}
