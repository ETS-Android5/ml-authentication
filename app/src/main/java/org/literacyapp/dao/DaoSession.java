package org.literacyapp.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import org.literacyapp.dao.Letter;
import org.literacyapp.dao.Word;
import org.literacyapp.dao.Number;
import org.literacyapp.dao.Audio;
import org.literacyapp.dao.Image;

import org.literacyapp.dao.LetterDao;
import org.literacyapp.dao.WordDao;
import org.literacyapp.dao.NumberDao;
import org.literacyapp.dao.AudioDao;
import org.literacyapp.dao.ImageDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig letterDaoConfig;
    private final DaoConfig wordDaoConfig;
    private final DaoConfig numberDaoConfig;
    private final DaoConfig audioDaoConfig;
    private final DaoConfig imageDaoConfig;

    private final LetterDao letterDao;
    private final WordDao wordDao;
    private final NumberDao numberDao;
    private final AudioDao audioDao;
    private final ImageDao imageDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        letterDaoConfig = daoConfigMap.get(LetterDao.class).clone();
        letterDaoConfig.initIdentityScope(type);

        wordDaoConfig = daoConfigMap.get(WordDao.class).clone();
        wordDaoConfig.initIdentityScope(type);

        numberDaoConfig = daoConfigMap.get(NumberDao.class).clone();
        numberDaoConfig.initIdentityScope(type);

        audioDaoConfig = daoConfigMap.get(AudioDao.class).clone();
        audioDaoConfig.initIdentityScope(type);

        imageDaoConfig = daoConfigMap.get(ImageDao.class).clone();
        imageDaoConfig.initIdentityScope(type);

        letterDao = new LetterDao(letterDaoConfig, this);
        wordDao = new WordDao(wordDaoConfig, this);
        numberDao = new NumberDao(numberDaoConfig, this);
        audioDao = new AudioDao(audioDaoConfig, this);
        imageDao = new ImageDao(imageDaoConfig, this);

        registerDao(Letter.class, letterDao);
        registerDao(Word.class, wordDao);
        registerDao(Number.class, numberDao);
        registerDao(Audio.class, audioDao);
        registerDao(Image.class, imageDao);
    }
    
    public void clear() {
        letterDaoConfig.getIdentityScope().clear();
        wordDaoConfig.getIdentityScope().clear();
        numberDaoConfig.getIdentityScope().clear();
        audioDaoConfig.getIdentityScope().clear();
        imageDaoConfig.getIdentityScope().clear();
    }

    public LetterDao getLetterDao() {
        return letterDao;
    }

    public WordDao getWordDao() {
        return wordDao;
    }

    public NumberDao getNumberDao() {
        return numberDao;
    }

    public AudioDao getAudioDao() {
        return audioDao;
    }

    public ImageDao getImageDao() {
        return imageDao;
    }

}
