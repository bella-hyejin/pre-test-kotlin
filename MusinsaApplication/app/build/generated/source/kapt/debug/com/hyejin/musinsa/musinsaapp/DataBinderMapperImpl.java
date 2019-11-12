package com.hyejin.musinsa.musinsaapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.hyejin.musinsa.musinsaapp.databinding.ActivityMeetingRoomBindingImpl;
import com.hyejin.musinsa.musinsaapp.databinding.ActivitySearchUserBindingImpl;
import com.hyejin.musinsa.musinsaapp.databinding.FavourtiesFragmentBindingImpl;
import com.hyejin.musinsa.musinsaapp.databinding.ReservationProgressBindingImpl;
import com.hyejin.musinsa.musinsaapp.databinding.UsersFragmentBindingImpl;
import com.hyejin.musinsa.musinsaapp.databinding.ViewMeetingRoomItemBindingImpl;
import com.hyejin.musinsa.musinsaapp.databinding.ViewUserItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMEETINGROOM = 1;

  private static final int LAYOUT_ACTIVITYSEARCHUSER = 2;

  private static final int LAYOUT_FAVOURTIESFRAGMENT = 3;

  private static final int LAYOUT_RESERVATIONPROGRESS = 4;

  private static final int LAYOUT_USERSFRAGMENT = 5;

  private static final int LAYOUT_VIEWMEETINGROOMITEM = 6;

  private static final int LAYOUT_VIEWUSERITEM = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hyejin.musinsa.musinsaapp.R.layout.activity_meeting_room, LAYOUT_ACTIVITYMEETINGROOM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hyejin.musinsa.musinsaapp.R.layout.activity_search_user, LAYOUT_ACTIVITYSEARCHUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hyejin.musinsa.musinsaapp.R.layout.favourties_fragment, LAYOUT_FAVOURTIESFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hyejin.musinsa.musinsaapp.R.layout.reservation_progress, LAYOUT_RESERVATIONPROGRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hyejin.musinsa.musinsaapp.R.layout.users_fragment, LAYOUT_USERSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hyejin.musinsa.musinsaapp.R.layout.view_meeting_room_item, LAYOUT_VIEWMEETINGROOMITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hyejin.musinsa.musinsaapp.R.layout.view_user_item, LAYOUT_VIEWUSERITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMEETINGROOM: {
          if ("layout/activity_meeting_room_0".equals(tag)) {
            return new ActivityMeetingRoomBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_meeting_room is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSEARCHUSER: {
          if ("layout/activity_search_user_0".equals(tag)) {
            return new ActivitySearchUserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_search_user is invalid. Received: " + tag);
        }
        case  LAYOUT_FAVOURTIESFRAGMENT: {
          if ("layout/favourties_fragment_0".equals(tag)) {
            return new FavourtiesFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for favourties_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_RESERVATIONPROGRESS: {
          if ("layout/reservation_progress_0".equals(tag)) {
            return new ReservationProgressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for reservation_progress is invalid. Received: " + tag);
        }
        case  LAYOUT_USERSFRAGMENT: {
          if ("layout/users_fragment_0".equals(tag)) {
            return new UsersFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for users_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWMEETINGROOMITEM: {
          if ("layout/view_meeting_room_item_0".equals(tag)) {
            return new ViewMeetingRoomItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_meeting_room_item is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWUSERITEM: {
          if ("layout/view_user_item_0".equals(tag)) {
            return new ViewUserItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_user_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(10);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "meetingRooms");
      sKeys.put(2, "nowDate");
      sKeys.put(3, "meetingRoom");
      sKeys.put(4, "isInTimes");
      sKeys.put(5, "reservations");
      sKeys.put(6, "nowPosition");
      sKeys.put(7, "user");
      sKeys.put(8, "users");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_meeting_room_0", com.hyejin.musinsa.musinsaapp.R.layout.activity_meeting_room);
      sKeys.put("layout/activity_search_user_0", com.hyejin.musinsa.musinsaapp.R.layout.activity_search_user);
      sKeys.put("layout/favourties_fragment_0", com.hyejin.musinsa.musinsaapp.R.layout.favourties_fragment);
      sKeys.put("layout/reservation_progress_0", com.hyejin.musinsa.musinsaapp.R.layout.reservation_progress);
      sKeys.put("layout/users_fragment_0", com.hyejin.musinsa.musinsaapp.R.layout.users_fragment);
      sKeys.put("layout/view_meeting_room_item_0", com.hyejin.musinsa.musinsaapp.R.layout.view_meeting_room_item);
      sKeys.put("layout/view_user_item_0", com.hyejin.musinsa.musinsaapp.R.layout.view_user_item);
    }
  }
}
