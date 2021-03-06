package github.tornaco.xposedmoduletest.ui.tiles.app;

import android.content.Context;
import android.view.View;

import dev.nick.tiles.tile.QuickTile;
import dev.nick.tiles.tile.QuickTileView;
import github.tornaco.xposedmoduletest.R;
import github.tornaco.xposedmoduletest.ui.activity.app.AboutDashboardActivity;

/**
 * Created by guohao4 on 2017/11/10.
 * Email: Tornaco@163.com
 */

public class PrivacyPolicy extends QuickTile {

    final static String URL = "https://raw.githubusercontent.com/Tornaco/X-APM/master/privacy-policy/notice";

    public PrivacyPolicy(final Context context) {
        super(context);
        this.titleRes = R.string.title_privacy_policy;
        this.iconRes = R.drawable.ic_info_black_24dp;

        this.tileView = new QuickTileView(context, this) {
            @Override
            public void onClick(View v) {
                super.onClick(v);
                AboutDashboardActivity a = (AboutDashboardActivity) context;
                a.navigateToWebPage(URL);
            }
        };
    }
}
