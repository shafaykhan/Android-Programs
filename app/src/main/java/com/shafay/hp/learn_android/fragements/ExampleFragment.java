package com.shafay.hp.learn_android.fragements;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shafay.hp.learn_android.R;
import com.shafay.hp.learn_android.adapter.CodeGroupAdapter;

import com.shafay.hp.learn_android.programs.display_execute.CustomDialogExecute;
import com.shafay.hp.learn_android.programs.display_execute.SeekBarExecute;
import com.shafay.hp.learn_android.programs.display_execute.SnackBarExecute;
import com.shafay.hp.learn_android.programs.display_execute.SpinnerExecute;
import com.shafay.hp.learn_android.programs.display_execute.SwipeRefreshLayoutExecute;
import com.shafay.hp.learn_android.programs.display_execute.Text_View;
import com.shafay.hp.learn_android.model.Code;
import com.shafay.hp.learn_android.model.CodeGroup;


import com.shafay.hp.learn_android.programs.display_execute.Accelerometer;
import com.shafay.hp.learn_android.programs.display_execute.Activity_Life_Cycle;
import com.shafay.hp.learn_android.programs.display_execute.AdUnit;
import com.shafay.hp.learn_android.programs.display_execute.Animation;
import com.shafay.hp.learn_android.programs.display_execute.ButtonE;
import com.shafay.hp.learn_android.programs.display_execute.Camera;
import com.shafay.hp.learn_android.programs.display_execute.Card_View;
import com.shafay.hp.learn_android.programs.display_execute.Custom_Fonts;
import com.shafay.hp.learn_android.programs.display_execute.Date_Picker;
import com.shafay.hp.learn_android.programs.display_execute.Drag_Drop;
import com.shafay.hp.learn_android.programs.display_execute.Explicit_Intent;
import com.shafay.hp.learn_android.programs.display_execute.Frame_Layout;
import com.shafay.hp.learn_android.programs.display_execute.Grid_View;
import com.shafay.hp.learn_android.programs.display_execute.Html;
import com.shafay.hp.learn_android.programs.display_execute.Implicit_Intent;
import com.shafay.hp.learn_android.programs.display_execute.Json_Parsing;
import com.shafay.hp.learn_android.programs.display_execute.List_View;
import com.shafay.hp.learn_android.programs.display_execute.Menu_View;
import com.shafay.hp.learn_android.programs.display_execute.Notification;
import com.shafay.hp.learn_android.programs.display_execute.Progress_Bar;
import com.shafay.hp.learn_android.programs.display_execute.Radio_Button;
import com.shafay.hp.learn_android.programs.display_execute.Rating_Bar;
import com.shafay.hp.learn_android.programs.display_execute.Search_View;
import com.shafay.hp.learn_android.programs.display_execute.Service_Life_Cycle;
import com.shafay.hp.learn_android.programs.display_execute.Splash_Screen;
import com.shafay.hp.learn_android.programs.display_execute.Sqlite;
import com.shafay.hp.learn_android.programs.display_execute.Table_Layout;
import com.shafay.hp.learn_android.programs.display_execute.Telephony;
import com.shafay.hp.learn_android.programs.display_execute.Time_Picker;
import com.shafay.hp.learn_android.programs.display_execute.ToastE;
import com.shafay.hp.learn_android.programs.display_execute.View_Pager;
import com.shafay.hp.learn_android.programs.display_execute.Web_View;
import com.shafay.hp.learn_android.programs.display_execute.Xml_Parsing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ExampleFragment extends Fragment {

    ArrayList<Code> code = new ArrayList<>();

    public ExampleFragment() {
    }

    public static ExampleFragment newInstance(String param1, String param2) {
        ExampleFragment fragment = new ExampleFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint("NewApi")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.example_fragement, container, false);
        RecyclerView rvItem = view.findViewById(R.id.rv_item);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        CodeGroupAdapter codeGroupAdapter = new CodeGroupAdapter(getActivity(), buildCodeGroupList());
        rvItem.setAdapter(codeGroupAdapter);
        rvItem.setLayoutManager(layoutManager);

        return view;
    }

    private List<CodeGroup> buildCodeGroupList() {

        code.add(new Code(1, "Text View", R.mipmap.text_view, "1. Android Widgets", Text_View.class));
        code.add(new Code(2, "Button", R.mipmap.button_view, "1. Android Widgets", ButtonE.class));
        code.add(new Code(3, "Progress Bar", R.mipmap.progress_bar, "1. Android Widgets", Progress_Bar.class));
        code.add(new Code(4, "Radio Button", R.mipmap.radio_button, "1. Android Widgets", Radio_Button.class));
        code.add(new Code(5, "Rating Bar", R.mipmap.rating_bar, "1. Android Widgets", Rating_Bar.class));
        code.add(new Code(6, "Date Picker", R.mipmap.date_picker, "3. Android Date & Time", Date_Picker.class));
        code.add(new Code(7, "Time Picker", R.mipmap.time_picker, "3. Android Date & Time", Time_Picker.class));
        code.add(new Code(8, "Frame Layout", R.mipmap.frame_layout, "2. Android Containers", Frame_Layout.class));
        code.add(new Code(9, "Table Layout", R.mipmap.table_layout, "2. Android Containers", Table_Layout.class));
        code.add(new Code(10, "Grid View", R.mipmap.grid_layout, "2. Android Containers", Grid_View.class));
        code.add(new Code(11, "List View", R.mipmap.list_layout, "2. Android Containers", List_View.class));
        code.add(new Code(12, "Web View", R.mipmap.web_layout, "2. Android Containers", Web_View.class));
        code.add(new Code(13, "Activity Lifecycle", R.mipmap.activity_life_cycle, "4. Android Life Cycle", Activity_Life_Cycle.class));
        code.add(new Code(14, "Service Lifecycle", R.mipmap.service_life_cycle, "4. Android Life Cycle", Service_Life_Cycle.class));
        code.add(new Code(15, "Explicit Intent", R.mipmap.explicit_intent, "5. Android Intents", Explicit_Intent.class));
        code.add(new Code(16, "Implicit Intent", R.mipmap.implicit_intent, "5. Android Intents", Implicit_Intent.class));
        code.add(new Code(17, "Toast", R.mipmap.toast, "7. Android Others", ToastE.class));
        code.add(new Code(18, "Telephony", R.mipmap.telephony, "7. Android Others", Telephony.class));
        code.add(new Code(19, "Notification", R.mipmap.notification, "7. Android Others", Notification.class));
        code.add(new Code(20, "Camera", R.mipmap.camera, "5. Android Intents", Camera.class));
        code.add(new Code(21, "Splash Screen", R.mipmap.splash, "7. Android Others", Splash_Screen.class));
        code.add(new Code(22, "Map", R.mipmap.map, "5. Android Intents", com.shafay.hp.learn_android.programs.display_execute.Map.class));
        code.add(new Code(23, "Menu", R.mipmap.menu, "2. Android Containers", Menu_View.class));
        code.add(new Code(24, "Sqlite", R.mipmap.sqlite, "7. Android Others", Sqlite.class));
        code.add(new Code(25, "Animation", R.mipmap.animation, "7. Android Others", Animation.class));
        code.add(new Code(26, "Accelerometer", R.mipmap.accelerometr, "7. Android Others", Accelerometer.class));
        code.add(new Code(27, "Html in Android", R.mipmap.html, "7. Android Others", Html.class));
        code.add(new Code(28, "Xml Parsing", R.mipmap.xml, "6. Android Data Parsing", Xml_Parsing.class));
        code.add(new Code(29, "Json Parsing", R.mipmap.json, "6. Android Data Parsing", Json_Parsing.class));
        code.add(new Code(30, "Ad Unit", R.mipmap.advertising, "7. Android Others", AdUnit.class));
        code.add(new Code(31, "Card View", R.mipmap.card_view, "2. Android Containers", Card_View.class));
        code.add(new Code(32, "View Pager", R.mipmap.view_pager, "7. Android Others", View_Pager.class));
        code.add(new Code(33, "Search View", R.mipmap.search, "2. Android Containers", Search_View.class));
        code.add(new Code(34, "Custom Fonts", R.mipmap.typography, "7. Android Others", Custom_Fonts.class));
        code.add(new Code(35, "Drag Drop Widget", R.mipmap.drag_drop, "7. Android Others", Drag_Drop.class));

        code.add(new Code(36, "SeekBar", R.mipmap.ic_spinner, "1. Android Widgets", SeekBarExecute.class));
        code.add(new Code(37, "Spinner", R.mipmap.ic_seek_bar, "1. Android Widgets", SpinnerExecute.class));
        code.add(new Code(38, "SnackBar", R.mipmap.ic_snack_bar, "1. Android Widgets", SnackBarExecute.class));
        code.add(new Code(39, "Custom Dialog", R.mipmap.notification, "1. Android Widgets", CustomDialogExecute.class));
        code.add(new Code(40, "Swipe Refresh Layout", R.mipmap.ic_swipe_refresh, "2. Android Containers", SwipeRefreshLayoutExecute.class));

        /*Map<String, List<Code>> codeMap = code.stream()
                .collect(Collectors.groupingBy(Code::getGroup));
        List<CodeGroup> codeGroupList = new ArrayList<>();
        for (Map.Entry<String, List<Code>> entry : codeMap.entrySet()) {
            CodeGroup codeGroup = new CodeGroup(entry.getKey(), entry.getValue());
            codeGroupList.add(codeGroup);
        }
        codeGroupList.sort(Comparator.comparing(CodeGroup::getCodeGroupTitle));*/
        Map<String, List<Code>> codeMap = new HashMap<>();
        for (Code code : code) {
            if (!codeMap.containsKey(code.getGroup())) {
                List<Code> codeList = new ArrayList<>();
                codeList.add(code);

                codeMap.put(code.getGroup(), codeList);
            } else {
                codeMap.get(code.getGroup()).add(code);
            }
        }

        List<CodeGroup> codeGroupList = new ArrayList<>();
        for (Map.Entry<String, List<Code>> entry : codeMap.entrySet()) {
            CodeGroup codeGroup = new CodeGroup(entry.getKey(), entry.getValue());
            codeGroupList.add(codeGroup);
        }
        Collections.sort(codeGroupList, new CodeGroup());

        return codeGroupList;
    }

}
