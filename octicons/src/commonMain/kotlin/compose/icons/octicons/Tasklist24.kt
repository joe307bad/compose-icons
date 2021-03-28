package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Tasklist24: ImageVector
    get() {
        if (_tasklist24 != null) {
            return _tasklist24!!
        }
        _tasklist24 = Builder(name = "Tasklist24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.28f, 9.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineToRelative(-5.97f, 5.97f)
                lineToRelative(-2.47f, -2.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 0.0f)
                lineToRelative(6.5f, -6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.75f, 2.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 2.0f, 3.75f)
                verticalLineToRelative(16.5f)
                curveToRelative(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(16.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 22.0f, 20.25f)
                verticalLineTo(3.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 20.25f, 2.0f)
                horizontalLineTo(3.75f)
                close()
                moveTo(3.5f, 3.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(16.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineTo(3.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineTo(3.75f)
                close()
            }
        }
        .build()
        return _tasklist24!!
    }

private var _tasklist24: ImageVector? = null
