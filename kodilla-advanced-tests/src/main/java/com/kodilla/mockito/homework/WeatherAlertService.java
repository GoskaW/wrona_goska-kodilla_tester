package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class WeatherAlertService {

   private Map<Location, Set<User>> locationSetMap = new HashMap<>();

   public void addUserToLocation(Location location, User user) {
      Set<User> userSet = locationSetMap.getOrDefault(location, new HashSet<>());
      userSet.add(user);
      locationSetMap.put(location, userSet);

   }

   public void removeUserFromLocation(Location location) {
      locationSetMap.remove(location);

      }

      public void removeAllUserSubscription(User user) {
      locationSetMap.values().forEach(users -> users.remove(user));

      }

      public void sendAlertToLocation(Location location, Alert alert) {
      locationSetMap.getOrDefault(location, new HashSet<>())
              .stream()
              .forEach(user -> user.receive(alert));


      }

      public void SendToAllUsers(Alert alert) {
      this.locationSetMap.forEach((location, users) -> users.forEach(user -> user.receive(alert)));
      }


}
