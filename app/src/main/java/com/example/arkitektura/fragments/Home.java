package com.example.arkitektura.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.arkitektura.R;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.arkitektura.adapter.CollegeAdapter;
import com.example.arkitektura.model.CollegeModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;
import java.util.ArrayList;

public class Home extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private RecyclerView recyclerView;
    private FloatingActionButton fabQR;
    private List<CollegeModel> collegeList;
    CollegeAdapter adapter;


    public Home() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Home.
     */
    // TODO: Rename and change types and number of parameters
    public static Home newInstance(String param1, String param2) {
        Home fragment = new Home();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.Colleges);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        collegeList = new ArrayList<>();
        collegeList.add(new CollegeModel(
                R.drawable.ui_coe,
                R.drawable.ic_ccis,
                "College of Computing and Information Sciences",
                "The college aims to produce future ready and globally competent information and communication technology professionals able to develop solutions for sustainable development.",
                "Programs include BSCS and BSIT"

        ));
        collegeList.add(new CollegeModel(
                R.drawable.ui_coe,
                R.drawable.ic_coe,
                "College of Engineering",
                "The College of Engineering (COE) was formally established in 1986 although it has its beginnings in 1982 when civil, mechanical, and electrical engineering started as curriculum offerings of the then MMSU Institute of Technology (IT). The courses were offered both in Laoag and Batac campuses under the supervision of the IT dean.\n" +
                        "\n" +
                        "On May 29, 1985, the three-degree programs ceased to be supervised by IT and were called engineering degree programs. The program’s curricula were then revised to suit the requisites of the board of civil, mechanical, and electrical engineering and the demands of the engineering profession as a whole.\n" +
                        "\n" +
                        "It was in 1986 when the College of Engineering and Technology was established and engineering students and faculty were transferred to the Batac campus.\n" +
                        "\n" +
                        "The college was renamed College of Engineering in 1993 and more engineering courses were offered: metallurgical, mining, computer, chemical, and electronics, and communications.",
                "With the advent of new technologies and innovations including opportunities in the field of material science and engineering, the Ceramics Engineering program was offered as a new program added to the existing engineering programs of COE on June 1, 1993.\n" +
                        "\n" +
                        "In 2010, the College welcomed the transfer of Agricultural Engineering from the then College of Agriculture and Forestry to the College of Engineering.\n" +
                        "\n" +
                        "The college has been providing relevant and quality engineering education that produces graduates who perform remarkably in agricultural, chemical, civil, electrical, electronics, and mechanical engineer licensure examinations.\n" +
                        "\n" +
                        "Several graduates have garnered places in the top 20 of their respective licensure examinations. Likewise, several programs were awarded top performers in licensure examinations."
        ));
        collegeList.add(new CollegeModel(
                R.drawable.ui_cas,
                R.drawable.ic_cas,
                "College of Arts and Sciences",
                "The College of Arts and Sciences (CAS) is the service college of the Mariano Marcos State University (MMSU).  It was created soon after the University was established in 1978 to accomplish the institutional goal of providing quality liberal education to students, in addition to satisfying the need to offer degree programs in the arts and sciences. The college started with 45 faculty members distributed among nine departments, each headed by a chairperson. As the student and faculty population increased, the college started offering degree programs and the departments became specialized.",
                "At present, the college has seven departments, namely: Biology; Physical Sciences; Languages and Literature; Mathematics; Computer Science; Physical Education; and Social Sciences. Also, it offers six degree programs all CHED-AACCUP accredited. These are BA English Language (for Level II); BA Communication (Level I); BS Biology (Level III and Center of Development); BS Mathematics (Level III); BS in Computer Science (Level III and Center of Development); BA Sociology (Level I); and BS Meteorology"
        ));
        collegeList.add(new CollegeModel(
                R.drawable.ui_cafsd,
                R.drawable.ic_cafsd,
                "College of Agriculture, Food, and Sustainable Development",
                "The College of Agriculture, Food and Sustainable Development (CAFSD) is the premiere college of the university. It traces its roots from the Batac Rural High School (BRHS), which was established in 1918. In 1969, BRHS was transformed into the Ilocos Norte Institute of Technology (INIT), a pioneering college. Although, it was not formally a college yet, two major fields in agriculture were then offered. These were animal husbandry and agronomy. Thus, in 1971, INIT produced its first graduates of the Bachelor of Science in Agriculture program.\n" +
                        "\n" +
                        "On December 19, 1974, INIT was converted into Mariano Marcos Memorial College of Science and Technology (MMMCST). The college then was composed of three departments, namely: agriculture, forestry, and home technology.\n" +
                        "\n" +
                        "The College of Agriculture (CA) was formally established when MMMCST was transformed into the Mariano Marcos State University on January 6, 1978 by virtue of Presidential Decree 1279. Its new building was constructed from 1981-1982 and on June 15, 1982; the faculty and the students finally occupied it. The college was renamed College of Agriculture and Forestry (CAF) in 1985.",
                "By virtue of Memorandum No. 010-048 issued by the Office of the MMSU President on April 27, 2010, CAF was renamed College of Agriculture , Food and Sustainable Development (CAFSD) in order to reflect cohesion of program offerings and for the necessary focus expected of its status as National University of Agriculture."
        ));
        collegeList.add(new CollegeModel(
                R.drawable.ui_cbea,
                R.drawable.ic_cbea,
                "College of Business, Economics, and Accountancy",
                "The College of Business, Economics and Accountancy (CBEA) was formally established in 1987. It is committed to develop a corps of competent and socially responsible professionals and entrepreneurs through quality management and business education, community-based research, extension and productivity- oriented programs.\n" +
                        "\n" +
                        "CBEA is one of the nine academic units of the university.  It is found at the University main campus in Batac, Ilocos Norte.",
                "The 1990’s led to many curricular and course changes to address the issue of looking into the relevance of degree offerings. More programs followed - BS Economics in 1989, BSBA - Entrepreneurship in 1990, BSBA-Management Accounting in 1994 and BSBA- Tourism Management in 1995. \n" +
                        "\n" +
                        "On August 1995, the MMSU Board of Regents (BoR) approved the transformation of the College of Economics and Management (CEM) to College of Business, Economics and Accountancy (CBEA) through BOR Resolution No. 262. This change reflects the widening focus and broader concerns of interest of the College.\n" +
                        "\n" +
                        "The BSBA - Entrepreneurship program was repackaged with cognates in accounting and cooperatives management in 1996. The BS in Cooperative Management was initially offered in SY 2000. \n" +
                        "\n" +
                        "In SY 2007-2008, two new major course offerings under the BSBA program were offered - Human Resource Development Management and Marketing Management.  The BSBA - Entrepreneurship was enhanced and renamed as BS in Entrepreneurship in compliance with CMO 17 s. 2005, In April 2010, the offering of the BS in Hospitality Management was assigned to the College. Starting SY 2010-2011, the College has the biggest number of enrolment in the University.\n" +
                        "\n" +
                        "In September 2010, three programs – BSBA majors in Management Accounting and Tourism Management, BS in Cooperatives Management, and BS in Entrepreneurship underwent preliminary evaluation by the Accrediting Agency of Chartered Colleges and Universities in the Philippines (AACCUP). On the following month, the BS Accountancy and BS Economics programs were evaluated and were awarded the full Level III.\n" +
                        "\n" +
                        "To be more responsive to the needs of the tourism industry, the Bachelor of Science in Tourism Management was offered in SY 2010 – 2011 by virtue of CHED memorandum Order Number 30, series of 2006.  The new program has two major specializations: Tour and Travel Management (TTM) and International Services Management (ISM). It superseded the offering of the BSBA Tourism Management program.  Along with the offering of the BS TM program, was the transfer of the BS Hospitality Management program, which was originally offered at the College of Agriculture, Food and Sustainable Development (CAFSD) in SY 2008 – 2009 as a four-year degree program.  At present, the BS HM operates as a ladderized program."
        ));
        collegeList.add(new CollegeModel(
                R.drawable.ui_chs,
                R.drawable.ic_chs,
                "College of Health Sciences",
                "I miss her.",
                "The College of Health Sciences (CHS) is continuously pursuing academic excellence and relevant education that caters not only to the health needs of the individual patient or family but also to the community as a whole, making it self-reliant and self-sustaining.\n" +
                        "\n" +
                        "The graduates of the three programs are performing well in terms of licensure examinations. The University is always being acknowledged by the Professional Regulation Commission (PRC) for continuously producing top-performing graduates. Likewise, the College is producing globally competitive health professionals. Some of its alumni are occupying managerial positions in top health and academic institutions in the local, national and international arena.\n" +
                        "\n" +
                        "Through the years, the College of Health Sciences has been led by dedicated and committed administrators who always saw to it that the College upholds the virtue of excellence. "
        ));
        collegeList.add(new CollegeModel(
                R.drawable.ui_col,
                R.drawable.ic_col,
                "College of Law",
                "The MMSU College of Law was established in response to a persistent clamor. As far back as before the year 1999, many professionals in the government and private sectors, especially those from the second district of Ilocos Norte, expressed in pursuing a career in law.\n" +
                        "\n" +
                        "Soon, local government units and the Integrated Bar of the Philippines forwarded official and formal representations for MMSU to open a school of law for the many young men and women who do not have the financial resources to go to the big cities to study law.\n" +
                        "\n" +
                        "The MMSU Law Program started to become a reality on March 11, 2008, when the MMSU Academic Council favorably endorsed its offerings. On March 27, 2008, the MMSU Board of Regents issued MMSU-BOR Resolution No. 957 S 2008, approving the offering of Bachelor of Laws degree at the MMSU Batac Campus.\n" +
                        "\n" +
                        "The MMSU College of Law formally came into existence in 2009 by virtue of the issuance of Government Permit No 005. Not as plush or as colorful as many law schools, the MMSU College of Law nevertheless has since consistently stood by its mission, vision and goals. Performance in the Bar Examinations has always been above the national average.",
                "MMSU College of Law graduates are now part of that breed of professionals known for their social awareness, competence, and above all, love for God and country.\n" +
                        "\n" +
                        "Guided by its mission, vision, and goals, and the men and women who have committed themselves to the propagation of decency and righteousness, it will continue to live on!"
        ));
        collegeList.add(new CollegeModel(
                R.drawable.ui_com,
                R.drawable.ic_com,
                "College of Medicine",
                "The Mariano Marcos State University conceptualized a Doctor of Medicine program under Board of Regents Resolution no. 279, s 1996 in the mid-1990s to complement its existing health sciences-related courses. However, this was shelved when the other State University in nearby Ilocos Sur opened its Doctor of Medicine Program in 1996.\n" +
                        "\n" +
                        "The viability of a Doctor of Medicine Program was revisited in 2011 when the Mariano Marcos Memorial Hospital and Medical Center submitted an unsolicited and independently-accomplished manifesto of support to its establishment. A feasibility study was consequently done confirming the up-to-date relevance and significance of the program’s establishment. Recognizing this pressing need, therefore, the Mariano Marcos State University has decided to set-up the MMSU College of Medicine as resolved in its Board Resolution no 1234, s. 2012. This move to open the MMSU-COM would hopefully fill the gap in the delivery of health services in various communities in Northern Luzon as well as strengthen the University’s commitment in excellence, integrity and service to God and nation.\n" +
                        "\n" +
                        "After more than two years of preparation and CHED visits, the Commission on Higher Education granted the Government Authority to operate the Doctor of Medicine Program in June 26, 2015. The permit to operate was renewed the next few years. The College with its MD Program on its 4th and final year was revisited by the CHED Technical Committee on Medical Education (TCME) on May 28-29, 2018. On June 6, 2019 CHED awarded the Certificate of Program Compliance (COPC) No. 006 Series of 2019 to the College of Medicine after satisfying the minimum requirements as prescribed by CHED to offer the Doctor of Medicine Program effective academic Year 2018-2019. This was in accordance with the pertinent provisions of RA No. 7722, the “Higher Education Act of 1994,” and by virtue of Resolution No. 163-2019 of the Commission en banc.",
                "On June 24, 2019, the college graduated its first batch of 14 medical students (Class 2019) out of an original 18. Several dignitaries from the medical and educational field attended and the university faculty and administration as well, a fitting tribute to the labor in preparing all structural, academic, documentary, and human resources needed in its MD Program."
        ));




        adapter = new CollegeAdapter(collegeList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}