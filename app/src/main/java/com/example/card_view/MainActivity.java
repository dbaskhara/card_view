package com.example.card_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<CardData> data = fill_with_data();
        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        CardAdapter rva = new CardAdapter(data,getApplication());
        rv.setAdapter(rva);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
    public List<CardData> fill_with_data(){
        List<CardData> data = new ArrayList<>();
        data.add(new CardData("Damien de la Tour","Human, Soldier, Knight", "I served Beauclair well. At least... I hope I did.",R.mipmap.image1));
        data.add(new CardData("Emhyr var Emreis","Human, Aristocrat", "They do not call me the Patient. Take care they do not call you the Headless.",R.mipmap.image2));
        data.add(new CardData("Usurper Officer","Human, Soldier", "He was an ordinary soldier until his mind was open to the madness around him.",R.mipmap.image3));
        data.add(new CardData("Vattier de Rideaux","Human, Agent, Aristocrat", "There's never been a problem a well–planned assassination couldn't solve.",R.mipmap.image4));
        data.add(new CardData("Braathens","Human, Mage, Agent", "His name sounded so similar to “urchin” in Nilfgaardian that Braathens decided to turn him into one. Years later Emhyr paid the mage back in kind. Braathens sounds just like “fried” after all.",R.mipmap.image5));
        data.add(new CardData("Ivar Evil-Eye","Witcher", "There’s a terrible tale behind each and every scar—you’d be surprised just how many are true.",R.mipmap.image6));
        data.add(new CardData("Leo Bonhart","Human", "There’s a terrible tale behind each and every scar—you’d be surprised just how many are true.",R.mipmap.image7));
        data.add(new CardData("Letho: Kingslayer","Witcher", "Why does this monk wear studded gloves…?",R.mipmap.image8));
        data.add(new CardData("Ramon Tyrconnel","Human, Soldier, Knight", "Colonel Ramon Tyrconnel, the young commander of the Ard Feainn division, whistled softly, staring at a point somewhere off in the distance…",R.mipmap.image9));
        data.add(new CardData("Stefan Skellen","Human, Agent", "My mark scars the face of our future empress. That is my proudest achievement.",R.mipmap.image10));
        data.add(new CardData("Vincent Van Moorlehem","Vampire, Aristocrat", "Everyone gives the Moorlehems a wide berth. Even tax collectors.",R.mipmap.image11));
        data.add(new CardData("Anna Henrietta","Human, Aristocrat", "As head of state, I must judge her fairly. But she is my sister, thus my heart bleeds for her…",R.mipmap.image12));
        data.add(new CardData("Cahir Dyffryn","Human, Soldier, Knight, Aristocrat", "His eyes flashed under his winged helmet. Fire gleamed from his sword's blade.",R.mipmap.image13));
        data.add(new CardData("Ffion var Gaernel","Human, Soldier", "Everyone will die somehow. I'll die last.",R.mipmap.image14));
        data.add(new CardData("Shilard Fitz-Oesterlen","Human, Agent, Aristocrat", "A diplomat is a man who uses many more words than necessary to express much less than he knows.",R.mipmap.image15));
        data.add(new CardData("Tibor Eggebracht","Human, Soldier", "Tibor's zeal was legendary. It was said when the emperor passed, he'd not so much bow as somersault.",R.mipmap.image16));
        data.add(new CardData("Vilgefortz","Human, Mage", "We are all pawns on his board. Playing a game whose rules we do not know.",R.mipmap.image17));
        data.add(new CardData("Vivienne de Tabris","Human, Cursed, Aristocrat", "Vivienne's a bit of an odd duck for a lady-in-waitin'. But by the Gods, ye can't deny her beauty an' grace!.",R.mipmap.image18));
        data.add(new CardData("Xarthisius","Human, Mage", "Astrology, hydromancy, haruspicy, ceromancy. Ovomancy, spodomancy, metroscopy, brontoscopy…",R.mipmap.image19));
        data.add(new CardData("Affan Hillergrand","Human, Soldier", "Jarre doesn't mention him in his books. Maybe he never heard of him. Maybe he heard too much.",R.mipmap.image20));
        data.add(new CardData("Doadrick Leumaerts","Human, Agent, Blindeyes", "The emperor has high expectations for you. See that you do not disappoint him. Hael Ker'zaer!",R.mipmap.image21));
        data.add(new CardData("Isbel of Hagge","Human, Mage", "I promised I would never again use magic to harm others.",R.mipmap.image22));
        data.add(new CardData("Letho of Gulet","Witcher", "Witchers never die in their beds.",R.mipmap.image23));
        data.add(new CardData("Menno Coehoorn","Human, Soldier", "I'll take an attentive reconnaissance unit over a fine brigade any day.",R.mipmap.image24));
        data.add(new CardData("Tourney Shaelmaar","Beast", "Releasing a monster that dangerous in front of a crowd? Plain irresponsible.",R.mipmap.image25));
        data.add(new CardData("Vypper","Beast", "Vicious, cunning. Known to wait patiently for hours before striking their prey. Once it uncoils to strike, there is no escape. Death is inevitable.— Ivar Evil-Eye",R.mipmap.image26));
        return data;
    }
}