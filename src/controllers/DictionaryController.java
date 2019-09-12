package controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    private static Map<String,String> dictionary;

    static {

        dictionary = new HashMap<>();
        dictionary.put("run","chay");
        dictionary.put("love","yeu");
        dictionary.put("hate","ghet");
    }

    @GetMapping("/translate")
    public String translateEng(@RequestParam String engWord, Model model){
        String vietWord=dictionary.get(engWord);
        if (dictionary.containsKey(engWord)){
            model.addAttribute("engWord",engWord);
            model.addAttribute("vietWord",vietWord);
        }else {
            model.addAttribute("engWord","not found");
        }
        return "translate";
    }

    @GetMapping("/")
    public String showResult(){
        return "translate";
    }
}
