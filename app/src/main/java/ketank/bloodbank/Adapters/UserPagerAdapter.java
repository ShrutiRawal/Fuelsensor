package ketank.bloodbank.Adapters;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import ketank.bloodbank.Fragments.BankStock;

public class UserPagerAdapter extends FragmentPagerAdapter {
    String [] title = {"Blood Banks","Donors NearBy"};

    public UserPagerAdapter(FragmentManager childFragmentManager)
    {
        super(childFragmentManager);



    }


    @Override
    public Fragment getItem(int position) {

        if(position==0) {
            return new BankStock();
        }else
            return new BankStock();


    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

}
